package com.paypad.network;

import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
/* loaded from: classes2.dex */
public class NibssSocketManager {
    private Socket socket;

    public NibssSocketManager(Socket socket) throws IOException {
        this.socket = socket;
    }

    private void resize(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[bArr.length * 2];
        for (int i = 0; i <= length - 1; i++) {
            bArr2[i] = bArr[i];
        }
    }

    public byte[] _getData() throws IOException {
        byte[] bArr = new byte[1024];
        DataInputStream dataInputStream = new DataInputStream(this.socket.getInputStream());
        if (dataInputStream.available() > 0) {
            dataInputStream.read(bArr);
        }
        return bArr;
    }

    public void disconnect() throws IOException {
        if (this.socket.isConnected()) {
            this.socket.close();
        }
    }

    public byte[] getData() {
        byte[] bArr = new byte[1024];
        try {
            DataInputStream dataInputStream = new DataInputStream(this.socket.getInputStream());
            int i = 0;
            while (dataInputStream.available() > 0) {
                int i2 = i + 1;
                bArr[i] = dataInputStream.readByte();
                if (i2 >= 1023) {
                    resize(bArr);
                }
                i = i2;
            }
            int i3 = i - 2;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 2, bArr2, 0, i3);
            return bArr2;
        } catch (Exception unused) {
            Log.i("PayPadISOERROR", "Internet connection lost");
            return new byte[0];
        }
    }

    public byte[] receive() {
        byte[] bArr = new byte[2];
        try {
            DataInputStream dataInputStream = new DataInputStream(this.socket.getInputStream());
            dataInputStream.readFully(bArr, 0, 2);
            int i = ((bArr[0] & 255) * 256) + (bArr[1] & 255);
            byte[] bArr2 = new byte[i];
            dataInputStream.readFully(bArr2, 0, i);
            dataInputStream.close();
            return bArr2;
        } catch (IOException unused) {
            Log.i("PayPadISOERROR", "Internet connection lost");
            return new byte[0];
        }
    }

    public boolean sendData(byte[] bArr) throws IOException {
        if (this.socket.isConnected()) {
            new DataOutputStream(this.socket.getOutputStream()).write(bArr);
            return true;
        }
        return true;
    }
}
