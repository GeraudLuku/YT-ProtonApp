package dme.systems.protonnapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dme.systems.protonnapp.ui.theme.ProtonnAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreview()
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    ProtonnAppTheme {
        Scaffold(
            backgroundColor = colorResource(id = R.color.background),
            topBar = {
                TopAppBar(backgroundColor = Color.White) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Dashboard", color = Color.Gray, fontSize = 20.sp)
                    }
                }
            },
            bottomBar = {
                BottomAppBar(backgroundColor = Color.White) {

                    BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.Home,
                                contentDescription = "home icon",
                                tint = Color.LightGray
                            )
                        }
                    })

                    BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.Person,
                                contentDescription = "home icon",
                                tint = Color.LightGray
                            )
                        }
                    })

                    BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
                        IconButton(
                            modifier = Modifier
                                .clip(shape = RoundedCornerShape(25))
                                .background(
                                    colorResource(id = R.color.blue)
                                ),
                            onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.Call,
                                contentDescription = "home icon",
                                tint = Color.White
                            )
                        }
                    })

                    BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.Check,
                                contentDescription = "home icon",
                                tint = Color.LightGray
                            )
                        }
                    })

                    BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.Menu,
                                contentDescription = "home icon",
                                tint = Color.LightGray
                            )
                        }
                    })
                }
            }
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 15.dp)
                    .padding(top = 20.dp)
                    .verticalScroll(rememberScrollState())
            ) {

                Text(
                    text = "Starts in 5 minutes",
                    color = Color.Black,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(bottom = 10.dp)
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)
                        .clip(shape = RoundedCornerShape(20))
                        .border(
                            width = 2.dp,
                            color = colorResource(id = R.color.blue),
                            shape = RoundedCornerShape(20)
                        )
                ) {
                    Row(modifier = Modifier.fillMaxWidth()) {

                        Column(
                            modifier = Modifier
                                .weight(0.2f)
                                .fillMaxSize()
                                .background(
                                    color = colorResource(
                                        id = R.color.blue
                                    )
                                ),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceAround,
                        ) {
                            Text(text = "09:45", color = Color.White, fontSize = 17.sp)
                            Text(text = "Join", color = Color.White, fontSize = 17.sp)
                        }

                        Row(
                            modifier = Modifier
                                .weight(0.8f)
                                .fillMaxHeight()
                                .padding(start = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(
                                    text = "Resume consultation",
                                    color = Color.DarkGray,
                                    fontSize = 20.sp
                                )
                                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                                    Text(text = "30min", color = Color.LightGray, fontSize = 12.sp)
                                }
                            }

                            Spacer(modifier = Modifier.weight(1f))

                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    imageVector = Icons.Filled.ArrowForward,
                                    contentDescription = "Arrow",
                                    tint = colorResource(id = R.color.blue)
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.size(30.dp))

                Text(
                    text = "Revenue",
                    color = Color.Black,
                    fontSize = 20.sp
                )

                Spacer(modifier = Modifier.size(10.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .clip(shape = RoundedCornerShape(10))
                ) {
                    Column(
                        modifier = Modifier
                            .padding(top = 10.dp, start = 10.dp)
                    ) {

                        Text(
                            text = "paid to you".uppercase(),
                            color = Color.Black,
                            fontSize = 11.sp,
                        )

                        Spacer(modifier = Modifier.size(20.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.Top
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "this month".uppercase(),
                                    color = Color.LightGray,
                                    fontSize = 11.sp
                                )
                                Text(
                                    text = "$15,000",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "$13k last month".uppercase(),
                                    color = Color.Green,
                                    fontSize = 11.sp
                                )
                            }

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "this month".uppercase(),
                                    color = Color.LightGray,
                                    fontSize = 11.sp
                                )
                                Text(
                                    text = "$72,000",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                        Spacer(modifier = Modifier.size(40.dp))

                        Text(
                            text = "outstanding payments".uppercase(),
                            color = Color.Black,
                            fontSize = 11.sp,
                        )

                        Spacer(modifier = Modifier.size(20.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.Top
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "pending payout".uppercase(),
                                    color = Color.LightGray,
                                    fontSize = 11.sp
                                )
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        text = "$6,000",
                                        color = Color.Black,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Icon(
                                        modifier = Modifier
                                            .size(20.dp)
                                            .padding(start = 5.dp),
                                        imageVector = Icons.Outlined.Info,
                                        contentDescription = "icon",
                                        tint = Color.LightGray
                                    )
                                }


                            }

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "unpaid invoices".uppercase(),
                                    color = Color.LightGray,
                                    fontSize = 11.sp
                                )
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        text = "$8,000",
                                        color = Color.Black,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Icon(
                                        modifier = Modifier
                                            .size(20.dp)
                                            .padding(start = 5.dp),
                                        imageVector = Icons.Outlined.Info,
                                        contentDescription = "icon",
                                        tint = Color.LightGray
                                    )
                                }
                                Text(
                                    text = "$3k overdue".uppercase(),
                                    color = Color.Red,
                                    fontSize = 11.sp
                                )
                            }
                        }

                        Spacer(modifier = Modifier.size(30.dp))

                        //graph section
                        Text(
                            text = "lifetime services breakdown".uppercase(),
                            color = Color.Black,
                            fontSize = 11.sp,
                        )
                        Spacer(modifier = Modifier.size(20.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                modifier = Modifier.size(128.dp),
                                painter = painterResource(id = R.drawable.graph),
                                contentDescription = "graph image"
                            )

                            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.Start) {
                                //Item
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(10.dp)
                                            .clip(shape = CircleShape)
                                            .background(
                                                color = colorResource(
                                                    id = R.color.blue
                                                )
                                            )
                                    )

                                    Text(
                                        text = "35%",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp,
                                        color = Color.Black
                                    )

                                    Text(
                                        text = "Resume edits",
                                        fontSize = 15.sp,
                                        color = Color.Gray
                                    )
                                }

                                //Item
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(10.dp)
                                            .clip(shape = CircleShape)
                                            .background(
                                                color = colorResource(
                                                    id = R.color.blue
                                                )
                                            )
                                    )

                                    Text(
                                        text = "35%",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp,
                                        color = Color.Black
                                    )

                                    Text(
                                        text = "Resume edits",
                                        fontSize = 15.sp,
                                        color = Color.Gray
                                    )
                                }

                                //Item
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(10.dp)
                                            .clip(shape = CircleShape)
                                            .background(
                                                color = colorResource(
                                                    id = R.color.blue
                                                )
                                            )
                                    )

                                    Text(
                                        text = "35%",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp,
                                        color = Color.Black
                                    )

                                    Text(
                                        text = "Resume edits",
                                        fontSize = 15.sp,
                                        color = Color.Gray
                                    )
                                }

                                //Item
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(10.dp)
                                            .clip(shape = CircleShape)
                                            .background(
                                                color = colorResource(
                                                    id = R.color.blue
                                                )
                                            )
                                    )

                                    Text(
                                        text = "35%",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp,
                                        color = Color.Black
                                    )

                                    Text(
                                        text = "Resume edits",
                                        fontSize = 15.sp,
                                        color = Color.Gray
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.size(20.dp))

                        Button(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(10),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = colorResource(id = R.color.blue)
                            ),
                            onClick = { /*TODO*/ }) {
                            Text(
                                text = "Create Invoice",
                                color = Color.White                            )
                        }

                        Spacer(modifier = Modifier.size(10.dp))

                        Button(
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(10),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = colorResource(id = R.color.white)
                            ),
                            onClick = { /*TODO*/ }) {
                            Text(
                                text = "View all invoices",
                                color = Color.Black
                            )
                        }
                        Spacer(modifier = Modifier.size(30.dp))
                    }
                }

                Spacer(modifier = Modifier.size(30.dp))

            }
        }
    }
}