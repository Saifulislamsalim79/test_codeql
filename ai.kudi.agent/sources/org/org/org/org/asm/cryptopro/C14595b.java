package org.org.org.org.asm.cryptopro;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import org.org.org.org.asm.C14598f;
/* renamed from: org.org.org.org.asm.cryptopro.b */
/* loaded from: classes.dex */
public final class C14595b implements InterfaceC14594a {

    /* renamed from: c */
    public static final C14595b f32346c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14595b $r0 = new C14595b();
        f32346c = $r0;
    }

    private C14595b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final ConnectivityManager close() {
        C14598f $r1 = C14598f.f32351c;
        Context $r2 = $r1.getContext();
        Object $r3 = $r2.getSystemService("connectivity");
        if ($r3 != null) {
            ConnectivityManager $r4 = (ConnectivityManager) $r3;
            return $r4;
        }
        NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        throw $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getType() {
        ConnectivityManager $r1 = close();
        NetworkInfo $r2 = $r1.getActiveNetworkInfo();
        if ($r2 != null) {
            boolean $z0 = $r2.isConnected();
            if ($z0) {
                int $i0 = $r2.getType();
                if ($i0 == 1) {
                    return "WIFI";
                }
                int $i02 = $r2.getType();
                if ($i02 == 0) {
                    int $i03 = $r2.getSubtype();
                    switch ($i03) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            return "2G";
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            return "3G";
                        case 13:
                        case 18:
                        case 19:
                            return "4G";
                        case 20:
                            return "5G";
                        default:
                            return "unknown";
                    }
                }
                return "unknown";
            }
            return "-";
        }
        return "-";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.cryptopro.InterfaceC14594a
    public boolean send() {
        ConnectivityManager $r1 = close();
        NetworkInfo $r2 = $r1.getActiveNetworkInfo();
        if ($r2 != null) {
            boolean $z0 = $r2.isConnected();
            if ($z0) {
                int $i0 = $r2.getType();
                return $i0 == 1;
            }
            return false;
        }
        return false;
    }
}
