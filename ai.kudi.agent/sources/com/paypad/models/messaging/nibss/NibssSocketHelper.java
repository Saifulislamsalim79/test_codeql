package com.paypad.models.messaging.nibss;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
/* loaded from: classes2.dex */
public class NibssSocketHelper {
    private Socket socket;

    public NibssSocketHelper(String str, int i) throws IOException {
        this.socket = new Socket(str, i);
    }

    public void disconnect() throws IOException {
        if (this.socket.isConnected()) {
            this.socket.close();
        }
    }

    public byte[] getData() throws IOException {
        byte[] bArr = new byte[2];
        DataInputStream dataInputStream = new DataInputStream(this.socket.getInputStream());
        dataInputStream.readFully(bArr);
        int i = (bArr[0] * 256) + bArr[1];
        byte[] bArr2 = new byte[i];
        dataInputStream.readFully(bArr2, 0, i);
        return bArr2;
    }

    public boolean sendData(byte[] bArr) throws IOException {
        if (this.socket.isConnected()) {
            byte[] bArr2 = new byte[bArr.length + 2];
            long length = bArr.length;
            bArr2[0] = (byte) (length >> 8);
            bArr2[1] = (byte) length;
            System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
            new DataOutputStream(this.socket.getOutputStream()).write(bArr2);
        }
        return true;
    }

    public byte[] sendReceive(byte[] bArr) {
        try {
            sendData(bArr);
            return getData();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
