import com.sun.tools.javac.Main
import javafx.application.Application
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import javafx.scene.control.Button
import javafx.scene.layout.BorderPane
import javafx.scene.layout.StackPane
import javafx.scene.text.Text
import java.awt.Desktop
import java.io.File
import java.io.IOException

//fun main(args: Array<String>){
//    var file = File("src/pdfs/Ars Magica 5E/City And Guild.pdf")
//
//    try {
//        Desktop.getDesktop().open(file);
//    } catch (ex: IOException) {
//        println("It no work")
//    }
//
//}
fun main(args: Array<String>){
    Application.launch(NamedClas::class.java, *args)
}

class NamedClas: Application() {
    override fun start(primaryStage: Stage){
        val test_button: Button = Button("Download PDF")
        val title_screen: Text = Text("Download Ars Magica 5e")

        val opening_scene: Scene = Scene(FXMLLoader.load(javaClass.getResource("mainpage.fxml")))

        primaryStage.scene = opening_scene
        primaryStage.title = "First Application"
        primaryStage.show()
    }
}