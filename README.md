# 🛒 ListaDeCompraApp  

Aplicación desarrollada con **Jetpack Compose** para probar diferentes componentes esenciales en Android.  

## 🌟 Características  
Esta app permite gestionar una lista de compras utilizando múltiples elementos de interfaz gráfica de usuario.  

## ✨ Componentes Usados  
✅ **Text** → Se usa para mostrar el título de la lista y etiquetas.  
✅ **Button** → Botón para agregar ítems a la lista.  
✅ **Image** → Imagen representativa del carrito de compras.  
✅ **Column, Row, Box** → Estructuras de diseño para organizar elementos.  
✅ **Spacer** → Añade espacios entre componentes para una mejor distribución.  
✅ **HorizontalDivider** → Separa visualmente los grupos de elementos.  
✅ **TextField & OutlinedTextField** → Para ingresar nombres y cantidades de productos.  
✅ **Checkbox** → Para marcar productos como comprados.  
✅ **Switch** → Para activar/desactivar notificaciones.  
✅ **Slider** → Permite ajustar la cantidad recomendada de productos.  
✅ **RadioButton** → Para seleccionar la prioridad de los productos.  

## 📸 Captura de Pantalla  
![captura de pantalla app](https://github.com/user-attachments/assets/13c7f2a8-7502-4739-a3b5-c0c3a14b4668)


## 🚀 Cómo Ejecutar el Proyecto  

1️⃣ **Clonar el repositorio:**  

```sh
git clone https://github.com/meliischimpf/ListaDeCompraApp.git
cd ListaDeCompraApp
```

2️⃣ **Abrir en Android Studio**  
- Ve a **File > Open** y selecciona la carpeta del proyecto.  
- Espera a que Gradle sincronice las dependencias.  

3️⃣ **Ejecutar la aplicación**  
Presiona **Run 'app'** en Android Studio para ver la aplicación en acción.  

## 🛠️ Dependencias  
Para trabajar con **Jetpack Compose** asegúrate de que `build.gradle.kts` incluya las siguientes dependencias:  

```kotlin
dependencies {
    implementation(libs.ui)
    implementation(libs.material3)
    implementation(libs.ui.tooling.preview)
    implementation(libs.androidx.runtime)
}
```

🎉 **¡Gracias por visitar el proyecto!**  
