package com.ppeper.canvasplayground.custom.graphiclayer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@Composable
fun GraphicLayerScreen() {
    var scaleX by remember { mutableFloatStateOf(1f) }
    var scaleY by remember { mutableFloatStateOf(1f) }
    var alpha by remember { mutableFloatStateOf(1f) }
    var translationX by remember { mutableFloatStateOf(0f) }
    var translationY by remember { mutableFloatStateOf(0f) }
    var shadowElevation by remember { mutableFloatStateOf(0f) }
    var rotationX by remember { mutableFloatStateOf(0f) }
    var rotationY by remember { mutableFloatStateOf(0f) }
    var rotationZ by remember { mutableFloatStateOf(0f) }
    var cameraDistance by remember { mutableFloatStateOf(0f) }
    // For TransfromOrigin
    var pivotFractionX by remember { mutableFloatStateOf(0.5f) }
    var pivotFractionY by remember { mutableFloatStateOf(0.5f) }
    var blurEffect by remember { mutableFloatStateOf(0f) }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(vertical = 24.dp)
                .align(Alignment.CenterHorizontally)
                .graphicsLayer(
                    alpha = alpha,
                    translationX = translationX * 200,
                    translationY = translationY * 200,
                    shadowElevation = shadowElevation * 50,
                    scaleX = scaleX,
                    scaleY = scaleY,
                    rotationX = rotationX * 360,
                    rotationY = rotationY * 360,
                    rotationZ = rotationZ * 360,
                    cameraDistance = cameraDistance * 50 + 8f,
                    transformOrigin = TransformOrigin(pivotFractionX, pivotFractionY),
                    renderEffect = BlurEffect(blurEffect * 50 + 1,blurEffect * 50 + 1),
                )
        ) {
            Text(text = "Compose GraphicLayer")
        }
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ){
            item{
                Column(
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
                ){
                    Text("Alpha($alpha)")
                    Slider(value = alpha, onValueChange ={
                        alpha = it
                    })
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
                ){
                    Text("TranslationX(${translationX*200})")
                    Slider(value = translationX, onValueChange ={
                        translationX = it
                    })
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
                ){
                    Text("TranslationY(${translationY*200})")
                    Slider(value = translationY, onValueChange ={
                        translationY = it
                    })
                }
            }
            item{
                Column(
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
                ){
                    Text("ShadowElevation(${shadowElevation*50})")
                    Slider(value = shadowElevation, onValueChange ={
                        shadowElevation = it
                    })
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
                ){
                    Text("ScaleX($scaleX)")
                    Slider(value = scaleX, onValueChange ={
                        scaleX = it
                    })
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
                ){
                    Text("ScaleY($scaleY)")
                    Slider(value = scaleY, onValueChange ={
                        scaleY = it
                    })
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
                ){
                    Text("RotationX(${rotationX*360})")
                    Slider(value = rotationX, onValueChange ={
                        rotationX = it
                    })
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
                ){
                    Text("RotationY(${rotationY*360})")
                    Slider(value = rotationY, onValueChange ={
                        rotationY = it
                    })
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
                ){
                    Text("RotationZ(${rotationZ*360})")
                    Slider(value = rotationZ, onValueChange ={
                        rotationZ = it
                    })
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
                ){
                    Text("Camera Distance(${cameraDistance*50+8})")
                    Slider(value = cameraDistance, onValueChange ={
                        cameraDistance = it
                    })
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
                ){
                    Text("Blur($blurEffect*50+1)")
                    Slider(value = blurEffect, onValueChange ={
                        blurEffect = it
                    })
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
                ){
                    Text("PivotFractionX($pivotFractionX)")
                    Slider(value = pivotFractionX, onValueChange ={
                        pivotFractionX = it
                    })
                }
            }
            item {
                Column(
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp)
                ){
                    Text("PivotFractionY($pivotFractionY)")
                    Slider(value = pivotFractionY, onValueChange ={
                        pivotFractionY = it
                    })
                }
            }
        }
    }
}