package pckg_class_param;

public class MainTest {
    public static void main(String[] args) {
        Package<String> stringPackage = new Package<>(String.class);
        stringPackage.addNewElementToPackage("Novi");
        stringPackage.addNewElementToPackage("Novi2");
        stringPackage.listPackageContent();
    }
}
