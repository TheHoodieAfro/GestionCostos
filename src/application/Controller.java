package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Producto;

public class Controller {
	
	// ------------------------------------- ProductosPane --------------------------------------
	@FXML private ListView<Producto> ProductosList;
	@FXML private Button AñadirBtn;
	@FXML private TextField NombreTxt;
	@FXML private TextField IDTxt;
	@FXML private TextField PrecioTxt;
	@FXML private TextField VentaTxt;

}
