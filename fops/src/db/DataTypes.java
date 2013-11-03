/**
 * An enum, yo.
 */

package db;

public static class DataTypes {
    public static enum College {
        ARTS_AND_SCIENCES,
        BUSINESS,
        EDUCATION;

        public static final int size = DataTypes.College.values().length;
    }

    public static enum Gender {
        MALE,
        FEMALE
    }

    public static enum Rank {
        LECTURER("lecturer"),
        SENIOR_LECTURER("senior lecturer");
        INSTRUCTOR("instructor"),
        ASSISTANT("assistant professor"),
        ASSOCIATE("associate professor"),
        PROFESSOR("professor"),

        private final String humanReadable;

        private Rank(String description) {
            humanReadable = description;
        }

        public String getHumanReadable() {
            return humanReadable;
        }
    }

    public static enum CommitteeType {
        UNIVERSITY,
        STANDING,
        FACULTY_ADVISORY,
        AD_HOC
    }

//  See below
//    public static enum Disciplines {
//        AMST, ANTH, ARAB, ARTH, ARTS, BIOL, BLST, BUAD, CHEM, CHIN, CLAS,
//        COMM, CPRD, CPSC, DANC, ECON, EDUC, EESC, ENGL, FREN, GEOG, GE0L,
//        GERM, GISC, GREK, HEED, HISP, HIST, INAF, ITAL, LATN, LIBS, LING,
//        LRSP, MATH, MSCI, MUSC, PHIL, PHYD, PHYS, PSCI, PSYC,
//        RELG, SOCG, SPAN, THEA, WGST
//    }

    public static enum Discipline {
        AMER_STUDIES, ANTHRO, ARTS, BIOLOGY, CHEMISTRY,
        CLASSICS, COMP_SCI, ECONOMICS, ENGLISH, ENV_SCI,
        FRENCH, GEOGRAPHY, GEOLOGY, HIST_PRESERVATION, HISTORY,
        INATL_AFFAIRS, LATIN, MATH, FOREIGN_LANG, MUSIC, PHILOSOPHY,
        PHYSICS, POLY_SCI, PSYCH, RELIGION, SOCIOLOGY, THEATRE, 
        GENDER_STUDIES
    }
}
