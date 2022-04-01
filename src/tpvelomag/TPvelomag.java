package tpvelomag;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import velomagp.Vcs;
import velomagp.Vcs.Sl.Si;

public class TPvelomag {

    public static void main(String[] args) throws JAXBException, MalformedURLException {
        JAXBContext jc = JAXBContext.newInstance("velomagp");
        Unmarshaller u = jc.createUnmarshaller();
        
        URL url = new URL("https://data.montpellier3m.fr/sites/default/files/ressources/TAM_MMM_VELOMAG.xml");
        Vcs vcs = (Vcs)u.unmarshal(url);
        List<Si> si = vcs.getSl().getSi();
        
        int nbPlacesDisponiblesTotal = 0;
        int nbPlacesTotal = 0;
        
        // coordonnees de 009 Observatoire la="43.606081" lg="3.876931"
        Si closestSi = new Si();
        double notreLongitude = 3.876932;
        double notreLatitude = 43.606082;
        closestSi.setLa(new BigDecimal(notreLatitude));
        closestSi.setLg(new BigDecimal(notreLongitude));
        double distanceClosestStation = distance(notreLatitude, si.get(0).getLa().doubleValue(), notreLongitude, si.get(0).getLg().doubleValue());

        
        for(int i =0; i < si.size(); i++){
            var currentStation = si.get(i);
            
            // affichages de base
            System.out.println("\nStation : " + currentStation.getNa());
            System.out.println("\tNombre de places libres : " + currentStation.getFr());
            System.out.println("\tPlace : " + currentStation.getAv() + "/" + currentStation.getTo());
            
            // calculs des totaux
            nbPlacesDisponiblesTotal = nbPlacesDisponiblesTotal + currentStation.getFr();
            nbPlacesTotal = nbPlacesTotal + currentStation.getTo();
            
            // calcul de la station la plus proche
            double distanceCurrentStation = distance(notreLatitude, currentStation.getLa().doubleValue(), notreLongitude, currentStation.getLg().doubleValue());
            System.out.println("\tDistance : " + distanceCurrentStation);
            if(distanceCurrentStation < distanceClosestStation){
                closestSi = currentStation;
                distanceClosestStation = distanceCurrentStation;
            }
        }
        
        System.out.println("Il reste " + nbPlacesDisponiblesTotal + " places au total sur Montpellier");
        System.out.println("Au total, Montpellier propose " + nbPlacesTotal + " places");
        
        System.out.println("\nLa station la plus proche de Longitude " + notreLongitude + " ,Latitude " + notreLatitude + " est : " + closestSi.getNa());
    }
    
    // https://stackoverflow.com/questions/3694380/calculating-distance-between-two-points-using-latitude-longitude
    public static double distance(double lat1, double lat2, double lon1, double lon2) {

        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        distance = Math.pow(distance, 2);

        return Math.sqrt(distance);
    }
}
