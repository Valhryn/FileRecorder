import javafx.fxml.FXML
import java.awt.Desktop
import java.io.File
import java.io.IOException

class ApplicationController(){
    fun initalize(){
        println("Hello World")
    }

    @FXML
    fun open_core_book(){
        var file = File("src/pdfs/Ars Magica 5E/City And Guild.pdf")

        try {
            Desktop.getDesktop().open(file);
        } catch (ex: IOException) {
            println("It no work")
        }
    }
}