package oop.inheritence;

public class Math extends Course{
    String mathLevel;
    String focusArea;

    @Override
    public String toString() {
        return "Math{\n" +
                "  mathLevel='" + mathLevel + "',\n" +
                "  focusArea='" + focusArea + "',\n" +
                "  courseId=" + courseId + ",\n" +
                "  courseName='" + courseName + "',\n" +
                "  credits=" + credits + ",\n" +
                "  instructorName='" + instructorName + "',\n" +
                "  scanner=" + scanner + "\n" +
                "}";
    }

}
