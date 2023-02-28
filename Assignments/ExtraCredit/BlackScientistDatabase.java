import java.util.Scanner;

public class BlackScientistDatabase {
    public static String[][] findScientist(String[][] scientists, String name, String byear, String field) {
        String[][] filteredScientist = new String[scientists.length][scientists[0].length];
        int count = 0;
        for (int i = 0; i < scientists.length; i++) {
            if (name.isEmpty() && byear.isEmpty() && field.isEmpty()) {
                filteredScientist[count] = scientists[i];
                count++;
            } else if (!name.isEmpty() && byear.isEmpty() && field.isEmpty()) {
                if (scientists[i][0].contains(name)) {
                    filteredScientist[count] = scientists[i];
                    count++;
                }
            } else if (name.isEmpty() && !byear.isEmpty() && field.isEmpty()) {
                if (Integer.parseInt(scientists[i][1]) >= Integer.parseInt(byear)) {
                    filteredScientist[count] = scientists[i];
                    count++;
                }
            } else if (name.isEmpty() && byear.isEmpty() && !field.isEmpty()) {
                if (scientists[i][2].contains(field)) {
                    filteredScientist[count] = scientists[i];
                    count++;
                }
            } else if (!name.isEmpty() && !byear.isEmpty() && field.isEmpty()) {
                if (scientists[i][0].contains(name) && Integer.parseInt(scientists[i][1]) >= Integer.parseInt(byear)) {
                    filteredScientist[count] = scientists[i];
                    count++;
                }
            } else if (!name.isEmpty() && byear.isEmpty() && !field.isEmpty()) {
                if (scientists[i][0].contains(name) && scientists[i][2].contains(field)) {
                    filteredScientist[count] = scientists[i];
                    count++;
                }
            } else if (name.isEmpty() && !byear.isEmpty() && !field.isEmpty()) {
                if (Integer.parseInt(scientists[i][1]) >= Integer.parseInt(byear) && scientists[i][2].contains(field)) {
                    filteredScientist[count] = scientists[i];
                    count++;
                }
            } else if (!name.isEmpty() && !byear.isEmpty() && !field.isEmpty()) {
                if (scientists[i][0].contains(name) && Integer.parseInt(scientists[i][1]) >= Integer.parseInt(byear)
                        && scientists[i][2].contains(field)) {
                    filteredScientist[count] = scientists[i];
                    count++;
                }
            }
        }
        return filteredScientist;

    }

    public static void main(String[] args) {
        /*
         * 
         * Dr. Mae Jemison
         * Born in 1956
         * Research fields: astronautics, engineering, and medicine
         * Jemison was the first Black woman to travel in space, serving as a mission
         * specialist aboard the space shuttle Endeavour in 1992. She also established
         * the Jemison Group, a company that uses technology to solve social and
         * environmental problems.
         * 
         * 
         * Dr. Shirley Ann Jackson
         * Born in 1946
         * Research fields: physics, materials science, and telecommunications
         * Jackson is a theoretical physicist who conducted extensive research on
         * condensed matter physics, which involves the study of the properties of
         * solids and liquids. She is also a pioneer in telecommunications research and
         * is credited with developing the technology that made Caller ID and Call
         * Waiting possible.
         * 
         * 
         * Dr. Percy Julian
         * Born in 1899
         * Research fields: organic chemistry, synthesis of medicinal compounds, and
         * natural product chemistry
         * Julian was an accomplished chemist who made many significant contributions to
         * the field of organic chemistry. He synthesized important medicinal compounds,
         * including a drug used to treat glaucoma, and also developed a way to extract
         * chemicals from soybeans, leading to the development of steroid medications.
         * 
         * 
         * Dr. Neil deGrasse Tyson
         * Born in 1958
         * Research fields: astrophysics, astronomy, and science communication
         * Tyson is a renowned astrophysicist who has made significant contributions to
         * the study of galaxies, stars, and black holes. He is also a prolific science
         * communicator who has hosted numerous television shows and written several
         * popular books about space and science.
         * 
         * 
         * Dr. Patricia Bath
         * Born in 1942
         * Research fields: ophthalmology, laser technology, and health disparities
         * Bath was an ophthalmologist who invented a device for removing cataracts
         * using lasers, making the procedure more precise and less invasive. She was
         * also a passionate advocate for health equity and worked to improve access to
         * eye care for underserved communities.
         * 
         */

        Scanner input = new Scanner(System.in);
        System.out.println(
                "Welcome to the database of Black scientists! Please enter text for the following filter criteria, or press Enter to skip filtering by that criteria.");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Birth year: ");
        String byear = input.nextLine();
        System.out.print("Field: ");
        String field = input.nextLine();

        String[][] scientists = { { "Dr. Mae Jemison", "1956", "astronautics, engineering, and medicine",
                "Jemison was the first Black woman to travel in space, serving as a mission specialist aboard the space shuttle Endeavour in 1992. She also established the Jemison Group, a company that uses technology to solve social and environmental problems." },
                { "Dr. Shirley Ann Jackson", "1946", "physics, materials science, and telecommunications",
                        "Jackson is a theoretical physicist who conducted extensive research on condensed matter physics, which involves the study of the properties of solids and liquids. She is also a pioneer in telecommunications research and is credited with developing the technology that made Caller ID and Call Waiting possible." },
                { "Dr. Percy Julian", "1899",
                        "organic chemistry, synthesis of medicinal compounds, and natural product chemistry" },
                { "Dr. Neil deGrasse Tyson", "1958", "astrophysics, astronomy, and science communication" },
                { "Dr. Patricia Bath", "1942", "ophthalmology, laser technology, and health disparities" } };

        String[][] result = findScientist(scientists, name, byear, field);

        for (int i = 0; i < result.length; i++) {
            if (result[i][0] != null) {
                System.out.println(result[i][0]);
                System.out.println("Born in " + result[i][1]);
                System.out.println("Research fields: " + result[i][2]);
                System.out.println();
            }
        }

        input.close();
    }
}
