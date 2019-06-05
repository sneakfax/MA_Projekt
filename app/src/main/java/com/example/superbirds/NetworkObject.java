package com.example.superbirds;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class NetworkObject {
    public float otherPlayersPosY;
    public float pipe1PosX;
    public float pipe2PosX;

    public int currentPlayersID;
    public float currentPlayersPosY;
    public float currentPlayersPipe1Pos;
    public float currentPlayersPipe2Pos;
    public boolean done;

    private String domain="heartbleed.de";

    public HttpURLConnection getConnection() throws IOException {
        URL addr = new URL("https://"+domain+"/app?getID=0&restart=0" +"&posY=" +this.currentPlayersPosY + "&id=" + this.currentPlayersID + "&pipe1="+this.currentPlayersPipe1Pos+ "&pipe2="+this.currentPlayersPipe2Pos);
        System.out.println(addr);
        HttpURLConnection connection = (HttpURLConnection) addr.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

        connection.setUseCaches(false);
        connection.setDoOutput(true);
        return connection;
    }
}
