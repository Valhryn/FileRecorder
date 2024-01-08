import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.layout.VBox
import java.awt.Desktop
import java.awt.Label
import java.io.File
import java.io.IOException

class ApplicationController(){
    val buttons: ArrayList<Button> = ArrayList()

    @FXML
    val pdf_buttons: VBox

    @FXML
    fun initialize(){
        val pdfs = File("C:\\Users\\edenj\\IdeaProjects\\PDF_App_2\\src\\pdfs").walk().forEach {
            if (it.isFile) {
                buttons.add(
                    Button("${it}")
                )
            }
        }
        println(buttons)
//        print(pdfs)
    }

    @FXML
    fun click_book(){
        open_core_book(0)
    }

    @FXML
    fun open_core_book(id: Int){
        var file = File("src/pdfs/Ars Magica 5E/City And Guild.pdf")

        try {
            Desktop.getDesktop().open(file);
        } catch (ex: IOException) {
            println("It no work")
        }
    }
}