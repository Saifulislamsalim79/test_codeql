package com.paypad.impl;

import android.content.Context;
import com.paypad.facade.PayPadManager;
import com.paypad.initialization.Activation;
import com.paypad.initialization.Reversal;
import com.paypad.models.messaging.nibss.Globals;
import com.paypad.utils.MiscUtils;
import p272h.p273a.p274a.C8211a;
/* loaded from: classes2.dex */
public class Paypad {
    private Activation activation;
    private Context context;
    private PayPadManager paypadManager;
    long counter = 0;
    long rrnCounter = 0;

    public Paypad(Context context) {
        this.context = context;
        this.paypadManager = new PayPadManager(context);
        this.activation = new Activation(context);
    }

    private void increment() {
        MiscUtils.initContext(this.context);
        String fromSharedPreferences = MiscUtils.getFromSharedPreferences("Configuration", C8211a.f19765w, "");
        String fromSharedPreferences2 = MiscUtils.getFromSharedPreferences("Configuration", C8211a.f19766x, "");
        long parseLong = Long.parseLong(fromSharedPreferences) + 1;
        long parseLong2 = Long.parseLong(fromSharedPreferences2) + 1;
        if (parseLong > 999999) {
            parseLong = 0;
        }
        Globals.stan = parseLong2 <= 999999999999L ? parseLong : 0L;
        Globals.rrn = parseLong2;
        MiscUtils.storeInSharedPreferences("Configuration", C8211a.f19765w, String.valueOf(Globals.stan));
        MiscUtils.storeInSharedPreferences("Configuration", C8211a.f19766x, String.valueOf(Globals.rrn));
    }

    public void activate(String str) {
        this.activation.setContext(this.context);
        this.activation.activateMerchant(str);
    }

    public String checkAmount(String str) {
        if (!str.contains(".")) {
            return str + ".00";
        }
        String substring = str.substring(str.indexOf(".") + 1);
        if (substring.length() == 0) {
            return str + "00";
        } else if (substring.length() != 1) {
            return substring.length() > 2 ? str.substring(0, str.indexOf(".") + 3) : str;
        } else {
            return str + "0";
        }
    }

    public void connect(Class<?> cls) {
        Globals.deviceActivityClass = cls;
        this.paypadManager.setContext(this.context);
        this.paypadManager.connect();
    }

    public void getAccountType(String str) {
        if (str.equals("default")) {
            Globals.AccountTypeFrom = "00";
        } else if (str.equals("savings")) {
            Globals.AccountTypeFrom = "10";
        } else if (str.equals("current")) {
            Globals.AccountTypeFrom = "20";
        } else if (str.equals("credit")) {
            Globals.AccountTypeFrom = "30";
        } else if (str.equals("universal")) {
            Globals.AccountTypeFrom = "40";
        }
    }

    public String getSerialNumber() {
        this.paypadManager.getSerialNumber();
        return Globals.POSSerialNumber;
    }

    public void initialize(Class<?> cls) {
        Globals.deviceActivityClass = cls;
        this.paypadManager.setContext(this.context);
        this.paypadManager.connect();
        Globals.initializing = true;
    }

    public void makePayment(String str, String str2, String str3) {
        try {
            Globals.purchaseRequest = null;
            Globals.responseCode = "XX";
            Globals.returnMessage = "Transaction not done";
            Globals.appResponse = "Transaction not done";
            Globals.paystackUrl = str3;
            increment();
            C8211a.f19745c = checkAmount(str);
            getAccountType(str2);
            new Thread(new Runnable() { // from class: com.paypad.impl.Paypad.1
                @Override // java.lang.Runnable
                public void run() {
                    Paypad.this.paypadManager.makepayment(C8211a.f19745c, Paypad.this.context);
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reversal() {
        new Thread(new Runnable() { // from class: com.paypad.impl.Paypad.2
            @Override // java.lang.Runnable
            public void run() {
                Reversal.reversal(Globals.purchaseRequest, Paypad.this.context);
            }
        }).start();
    }
}
