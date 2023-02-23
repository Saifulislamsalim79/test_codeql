package ai.kudi.agent.network;

import ai.kudi.agent.network.exceptions.NoConnectivityException;
import ai.kudi.agent.network.util.ConnectivityUtil;
import android.content.Context;
import android.content.Intent;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.InterfaceC14233u;
/* compiled from: ConnectionCheckInterceptor.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/network/ConnectionCheckInterceptor;", "Lokhttp3/Interceptor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "logout", "", "network_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ConnectionCheckInterceptor implements InterfaceC14233u {
    private final Context context;

    public ConnectionCheckInterceptor(Context context) {
        Log_OC.getArray(context, "context");
        this.context = context;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p565l.InterfaceC14233u
    public C14131c0 intercept(InterfaceC14233u.InterfaceC14234a interfaceC14234a) throws IOException {
        Log_OC.getArray(interfaceC14234a, "chain");
        Context $r2 = this.context;
        boolean $z0 = ConnectivityUtil.isConnected($r2);
        if (!$z0) {
            NoConnectivityException $r5 = new NoConnectivityException("No internet");
            throw $r5;
        }
        C14116a0 $r3 = interfaceC14234a.request();
        C14131c0 $r4 = interfaceC14234a.mo2478a($r3);
        int $i0 = $r4.m2887F();
        if ($i0 == 440) {
            logout();
        }
        Log_OC.loadImage($r4, "response");
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logout() {
        Context $r3 = this.context;
        Class $r2 = Class.forName("ai.kudi.agent.login.ui.LoginActivity");
        Intent $r1 = new Intent($r3, $r2);
        $r1.setFlags(268468224);
        Context $r32 = this.context;
        $r32.startActivity($r1);
    }
}
