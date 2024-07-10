# DEBER INDIVIDUAL
# MOSTRAR LA TABLA DE RESULTADOS DE CONDUCTORES EN UNA TABLAVIEW
![image](https://github.com/vnssmb/deber-individual/assets/142614155/fd809875-3366-46ed-8057-92276233b2b1)
EL PRESENTE PROYECTO ES UNA APLICACIÓN JAVAFX QUE MUESTRA UNA TABLA DE CONSTRUCTORES DE FÓRMULA 1 POR AÑO. ESTE PERMITE SELECCIONAR UN AÑO ESPECÍFICO Y MUESTRA LOS DETALLES PARA ESE AÑO.

# CONFIGURACION AL ARCHIVO
EN ESTE CASO SE TUVO QUE MODIFICAR "module-info.java" PARA QUE SE EJECUTE CORRECTAMENTE. LA CORRECIÓN FUE LA SIGUIENTE:
module Deber {
    requires javafx.controls;
    requires javafx.fxml;
    opens application to javafx.base;
    exports application;
}

# MAIN.JAVA
## MÉTODO "start"
ESTE ES EL MÉTODO PRINCIPAL DE LA APLICACIÓN JAVAFX, DONDE SE CONFIGURA LA INTERFAZ DE USUARIO Y LA  LÓGICA DE LA APLICACIÓN.

## COMBOBOX
PERMITE SELECCIONAR EL AÑO PARA EL CUAL SE DESEAN VER LOS DETALLES DE LOS CONSTRUCTORES.
SE AGREGAN LOS AÑOS DISPONIBLES CON "yearComboBox.getItems().addAll(2014,....)"

## TABLEVIEW
Se configura una TableView para mostrar los datos de los constructores. La tabla contiene cuatro columnas: nameColumn, winsColumn, totalPointsColumn y rankColumn.

## DATOS DE LOS CONSTRUCTORES POR AÑO
Se crean listas de datos para cada año, utilizando ObservableList.

## MANEJO DEL EVENTO DE SELECCION DEL COMBOBOX
Se configura un manejador de eventos para actualizar la tabla cuando el usuario selecciona un año diferente en el ComboBox.

## CONFIGURACION DE LA ESCENA
Se configura el VBox que contiene el ComboBox y la TableView, y se crea la escena que se mostrará en el Stage principal.

# EJECUCIÓN
![image](https://github.com/vnssmb/deber-individual/assets/142614155/c46e1fb8-ef5a-401b-b659-517ee2815c2f)
![image](https://github.com/vnssmb/deber-individual/assets/142614155/9628011f-79ca-4960-9fcc-e682190cf328)



