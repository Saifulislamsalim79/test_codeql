package androidx.biometric;

import ai.kudi.agent.pin.KudiPin;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.java */
/* renamed from: androidx.biometric.m */
/* loaded from: classes2.dex */
public class C1214m {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m36743a() {
        C1193c m36801f = C1193c.m36801f();
        return m36801f != null && m36801f.m36799h();
    }

    /* renamed from: b */
    private static boolean m36742b(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m36741c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return false;
            case 6:
            default:
                return true;
        }
    }

    /* renamed from: d */
    private static boolean m36740d(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.activity.ComponentActivity, androidx.biometric.DeviceCredentialHandlerActivity, android.app.Activity] */
    /* renamed from: e */
    public static void m36739e(String str, androidx.fragment.app.i iVar, Bundle bundle, Runnable runnable) {
        KeyguardManager keyguardManager;
        CharSequence charSequence;
        if (!(iVar instanceof DeviceCredentialHandlerActivity)) {
            Log.e(str, "Failed to check device credential. Parent handler not found.");
            return;
        }
        ?? r5 = (DeviceCredentialHandlerActivity) iVar;
        if (Build.VERSION.SDK_INT >= 23) {
            keyguardManager = (KeyguardManager) r5.getSystemService(KeyguardManager.class);
        } else {
            Object systemService = r5.getSystemService("keyguard");
            if (!(systemService instanceof KeyguardManager)) {
                Log.e(str, "Failed to check device credential. KeyguardManager not found.");
                r5.m36825h(0);
                return;
            }
            keyguardManager = (KeyguardManager) systemService;
        }
        if (keyguardManager == null) {
            Log.e(str, "Failed to check device credential. KeyguardManager was null.");
            r5.m36825h(0);
            return;
        }
        CharSequence charSequence2 = null;
        if (bundle != null) {
            charSequence2 = bundle.getCharSequence(KudiPin.KUDI_PIN_TITLE);
            charSequence = bundle.getCharSequence("subtitle");
        } else {
            charSequence = null;
        }
        Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(charSequence2, charSequence);
        if (createConfirmDeviceCredentialIntent == null) {
            Log.e(str, "Failed to check device credential. Got null intent from Keyguard.");
            r5.m36825h(0);
            return;
        }
        C1193c m36802e = C1193c.m36802e();
        m36802e.m36794m(true);
        m36802e.m36791p();
        if (runnable != null) {
            runnable.run();
        }
        createConfirmDeviceCredentialIntent.setFlags(134742016);
        r5.startActivityForResult(createConfirmDeviceCredentialIntent, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m36738f(androidx.fragment.app.i iVar) {
        if (!(iVar instanceof DeviceCredentialHandlerActivity) || iVar.isFinishing()) {
            return;
        }
        iVar.finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m36737g(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return m36742b(context, str, C1207f.hide_fingerprint_instantly_prefixes);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m36736h(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return m36740d(context, str, C1207f.crypto_fingerprint_fallback_vendors) || m36742b(context, str2, C1207f.crypto_fingerprint_fallback_prefixes);
    }
}
