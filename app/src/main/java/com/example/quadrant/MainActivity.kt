package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BackGroundContainer("Android")
                }
            }
        }
    }
}

@Composable
fun TitleText(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )
}

@Composable
fun BodyText(body: String, modifier: Modifier = Modifier) {
    Text(
        text = body,
        textAlign = TextAlign.Justify,

        modifier = modifier.padding(16.dp)
    )
}

@Composable
fun QuadrantCard(titleWrapper: Composable, body: Composable, color: Color, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(0.5f)
            .background(color = color)
    )
    {
        TitleText(title = "Image Composable", modifier.align(Alignment.CenterHorizontally))
        BodyText(body = "Displays text and follows the recommended Material Design guidelines")
    }
}

@Composable
fun BackGroundContainer(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Row(modifier = Modifier.weight(1f)) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFEADDFF))
            )
            {
                TitleText(title = stringResource(R.string.title_composable), modifier.align(Alignment.CenterHorizontally))
                BodyText(body = stringResource(R.string.body_composable))
            }

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFD0BCFF))
            )
            {
                TitleText(title = stringResource(R.string.image_composable), modifier.align(Alignment.CenterHorizontally))
                BodyText(body = stringResource(R.string.image_body_composable))
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFB69DF8))
            )
            {
                TitleText(title = stringResource(R.string.title_row_composable), modifier.align(Alignment.CenterHorizontally))
                BodyText(body = stringResource(R.string.body_row_composable))
            }
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFF6EDFF))
            )
            {
                TitleText(title = stringResource(R.string.title_column_composable), modifier.align(Alignment.CenterHorizontally))
                BodyText(body = stringResource(R.string.body_column_composable))
            }



        }

    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    QuadrantTheme {
        BackGroundContainer("Android")
    }
}