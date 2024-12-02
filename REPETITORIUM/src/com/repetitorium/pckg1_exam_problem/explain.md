```
Element added to the list | Element type: User

--------------- Undo stack: ---------------
Command class: AddNewElementToList@1ddc4ec2 | Element type: User

--------------- Redo stack: ---------------

Element already in list!

--------------- Undo stack: ---------------
Command class: AddNewElementToList@1ddc4ec2 | Element type: User
Command class: AddNewElementToList@37a71e93 | Element type: User
```


# Objašnjenje
U undo stacku se pojavila komanda za dodavanje iako element nije dodan(već je bio u listi).

To je ok jer ako pokušamo undoati tu komandu - ona će handlati to sama - ispis: "nema što undoati" 


```java
@Override
    public void undoCommand() {
        if (list.contains(element)) {
            list.remove(element);
            System.out.println("Undo add new element = remove element. Element removed!");
        } else {
            System.out.println("Nothing to undo!");
        }
    }
```

### Poanta: logika je unutar command klase, a ne u undo/redo stacku
