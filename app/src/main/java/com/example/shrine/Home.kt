package com.example.shrine

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shrine.ui.theme.ShrineTheme

@Composable
fun Home(){
    Surface() {
        Column(Modifier.fillMaxSize()) {
            TopAppBar(
                title = { Text("Main Page") },
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Default.Home, contentDescription = null)
                    }
                }
            )
            Column(Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly){
                Row(horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp)){
                    Card(){
                        Column(modifier = Modifier.padding(7.dp),
                        horizontalAlignment = Alignment.CenterHorizontally){
                            Image(painterResource(id =R.drawable.real_home_),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.width(120.dp)
                                    .height(120.dp)
                            )
                            Divider(
                                modifier = Modifier.width(150.dp),
                            color= MaterialTheme.colors.onSurface,
                            thickness = 1.dp
                            )
                            Text(text = "Real Estate".uppercase(),
                                style=MaterialTheme.typography.body1)
                        }
                    }

                    Card(){
                        Column(modifier = Modifier.padding(7.dp),
                            horizontalAlignment = Alignment.CenterHorizontally){
                            Image(painterResource(id =R.drawable.f_home_),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.width(120.dp)
                                    .height(120.dp)
                            )
                            Divider(
                                modifier = Modifier.width(150.dp),
                                color= MaterialTheme.colors.onSurface,
                                thickness = 1.dp
                            )
                            Text(text = "Furniture stores".uppercase(),
                                style=MaterialTheme.typography.body1)
                        }
                    }

                }

                Row(horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)){
                    Card(){
                        Column(modifier = Modifier.padding(7.dp),
                            horizontalAlignment = Alignment.CenterHorizontally){
                            Image(painterResource(id =R.drawable.l_home_),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.width(120.dp)
                                    .height(120.dp)
                            )
                            Divider(
                                modifier = Modifier.width(150.dp),
                                color= MaterialTheme.colors.onSurface,
                                thickness = 1.dp
                            )
                            Text(text = "Law firms".uppercase(),
                                style=MaterialTheme.typography.body1)
                        }
                    }

                    Card(){
                        Column(modifier = Modifier.padding(7.dp),
                            horizontalAlignment = Alignment.CenterHorizontally){
                            Image(painterResource(id =R.drawable.rhome),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.width(120.dp)
                                    .height(120.dp)
                            )
                            Divider(
                                modifier = Modifier.width(150.dp),
                                color= MaterialTheme.colors.onSurface,
                                thickness = 1.dp
                            )
                            Text(text = "Restaurants".uppercase(),
                                style=MaterialTheme.typography.body1)
                        }
                    }

                }

            }
            }

            }
        }



@Preview
@Composable
fun HomePreview(){
    ShrineTheme {
        Home()
    }
}