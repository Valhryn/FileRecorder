import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class ApplicationController {
//    val buttons: ArrayList<Button> = ArrayList()
//
//    FXML var pdf_buttons: VBox<>;
//
//    @FXML
//    fun initialize(){
//        val pdfs = File("C:\\Users\\edenj\\IdeaProjects\\PDF_App_2\\src\\pdfs").walk().forEach {
//            if (it.isFile) {
//                buttons.add(
//                    Button("${it}")
//                )
//            }
//        }
//        println(buttons)
////        print(pdfs)
//    }
//
//    @FXML
//    fun click_book(){
//        open_core_book(0)
//    }
//
//    @FXML
//    fun open_core_book(id: Int){
//        var file = File("src/pdfs/Ars Magica 5E/City And Guild.pdf")
//
//        try {
//            Desktop.getDesktop().open(file);
//        } catch (ex: IOException) {
//            println("It no work")
//        }
//    }

    ArrayList<Button> buttons = new ArrayList<Button>();

    @FXML
    private VBox pdf_buttons;

    public void initialize(){
//        File pdfFolder = new File("C:\\\\Users\\\\edenj\\\\IdeaProjects\\\\PDF_App_2\\\\src\\\\pdfs");
//        File[] listOfPdfs = pdfFolder.listFiles();
//        for (int i = 0; i < Objects.requireNonNull(listOfPdfs).length; i++){
//            System.out.println(listOfPdfs[i]);
//        }
    }

    public void openBook(ActionEvent actionEvent){
//        if (id == 0){
        File file = new File("src/pdfs/Ars Magica 5E/City And Guild.pdf");

        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            System.out.println("it no work");
        }
//        }
    }
}