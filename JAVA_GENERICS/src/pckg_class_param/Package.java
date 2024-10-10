package pckg_class_param;

import java.util.ArrayList;

public class Package<T> {

    private final ArrayList<T> pckgContent;
    private Class<T> classType;

    public Package(Class<T> type){
        this.classType = type;
        this.pckgContent = new ArrayList<>();
    }

    public void addNewElementToPackage(T pckgElement){
        if(pckgContent.contains(pckgElement)){
            System.out.println("Already in package...");
        } else {
            pckgContent.add(pckgElement);
            System.out.println("Added new elements");
        }
    }

    public void listPackageContent(){
        if(pckgContent.isEmpty()){
            System.out.println("Package is empty");
        } else {
            for(T conEl: pckgContent){
                System.out.println(conEl);
            }
        }
    }
}
