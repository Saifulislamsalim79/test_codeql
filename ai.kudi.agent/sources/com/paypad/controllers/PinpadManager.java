package com.paypad.controllers;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.Build;
import com.datecs.pinpad.C2396b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
/* loaded from: classes2.dex */
public class PinpadManager {
    private static final boolean PINPAD_DEBUG = true;
    private static final UUID SPP_UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    private static PinpadManager sInstance = null;
    private Context context;
    private BluetoothAdapter mBtAdapter = BluetoothAdapter.getDefaultAdapter();
    private BluetoothSocket mBtSocket;
    private OnConnectionEstablishedListener mOnConnectEstablishedListener;
    private OnConnectionClosedListener mOnConnectionClosedListener;
    private C2396b mPinpad;

    /* loaded from: classes2.dex */
    public interface OnConnectionClosedListener {
        void OnConnectionClosed();
    }

    /* loaded from: classes2.dex */
    public interface OnConnectionEstablishedListener {
        void OnConnectionEstablished();
    }

    private PinpadManager(Context context) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeBtConnection() {
        C2396b c2396b = this.mPinpad;
        if (c2396b != null) {
            c2396b.m33074B0(null);
            this.mPinpad.m32988u0();
            this.mPinpad = null;
        }
        BluetoothSocket bluetoothSocket = this.mBtSocket;
        if (bluetoothSocket != null) {
            try {
                bluetoothSocket.close();
                this.mBtSocket = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private BluetoothSocket getBtSocket(String str) throws IOException {
        BluetoothDevice remoteDevice = this.mBtAdapter.getRemoteDevice(str);
        if (Build.VERSION.SDK_INT < 10) {
            return remoteDevice.createRfcommSocketToServiceRecord(SPP_UUID);
        }
        try {
            return (BluetoothSocket) remoteDevice.getClass().getMethod("createInsecureRfcommSocketToServiceRecord", UUID.class).invoke(remoteDevice, SPP_UUID);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new IOException(e);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            throw new IOException(e2);
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            throw new IOException(e3);
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            throw new IOException(e4);
        }
    }

    public static PinpadManager getInstance(Context context) {
        C2396b.m32978z0(true);
        if (sInstance == null) {
            sInstance = new PinpadManager(context);
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setConnected(boolean z) {
        if (z) {
            if (this.mOnConnectEstablishedListener != null) {
                this.mOnConnectEstablishedListener.OnConnectionEstablished();
            }
        } else if (this.mOnConnectionClosedListener != null) {
            this.mOnConnectionClosedListener.OnConnectionClosed();
        }
    }

    private synchronized void validateConnection(BluetoothSocket bluetoothSocket) throws IOException {
        C2396b c2396b = new C2396b(bluetoothSocket.getInputStream(), bluetoothSocket.getOutputStream());
        c2396b.m33070D0(4096, 256, 50);
        c2396b.m33074B0(new C2396b.InterfaceC2404g() { // from class: com.paypad.controllers.PinpadManager.1
            @Override // com.datecs.pinpad.C2396b.InterfaceC2404g
            public void onPinpadRelease() {
                PinpadManager.this.closeBtConnection();
                PinpadManager.this.setConnected(false);
            }
        });
        this.mPinpad = c2396b;
        this.mBtSocket = bluetoothSocket;
        setConnected(true);
    }

    public synchronized void connect(String str) throws IOException {
        closeBtConnection();
        BluetoothSocket btSocket = getBtSocket(str);
        this.mBtAdapter.cancelDiscovery();
        btSocket.connect();
        try {
            validateConnection(btSocket);
        } catch (IOException e) {
            btSocket.close();
            throw e;
        }
    }

    public synchronized void disconnect() {
        closeBtConnection();
        setConnected(false);
    }

    public String getBluetoothAddress() {
        return this.mBtSocket.getRemoteDevice().getAddress();
    }

    public String getBluetoothName() {
        return this.mBtSocket.getRemoteDevice().getName();
    }

    public C2396b getPinpad() {
        return this.mPinpad;
    }

    public void setOnConnectionClosedListener(OnConnectionClosedListener onConnectionClosedListener) {
        this.mOnConnectionClosedListener = onConnectionClosedListener;
    }

    public void setOnConnectionEstablishedListener(OnConnectionEstablishedListener onConnectionEstablishedListener) {
        this.mOnConnectEstablishedListener = onConnectionEstablishedListener;
    }
}
