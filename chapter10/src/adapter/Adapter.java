//package Adapter;
//
//import javax.json.Json;
//import javax.json.JsonObject;
//
//public class Adapter implements PersonalInformation{
//    private PersonalDataI personalDataI;
//
//    public Adapter(PersonalDataI personalDataI) {
//        this.personalDataI = personalDataI;
//    }
//
//    @Override
//    public String getPersonalInformation() {
//        JsonObject json = Json.createObjectBuilder()
//                .add("name", personalDataI.getName())
//                .add("year of birth",personalDataI.getBDay().getYear())
//                .add("email",personalDataI.getEmail())
//                .add("telephone",personalDataI.getTelephone())
//                .build();
//        return json.toString();
//    }
//}
