package ai.kudi.agent.network.util;

import ai.kudi.agent.network.exceptions.NoConnectivityException;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import io.reactivex.exceptions.CompositeException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
/* loaded from: classes.dex */
public final class ConnectivityUtil {
    private ConnectivityUtil() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean handleCompositeException(io.reactivex.exceptions.CompositeException r7, java.lang.Class r8) {
        /*
            java.util.List r0 = r7.m11652b()
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r3 = r1.next()
            r5 = r3
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r4 = r5
            boolean r2 = r8.isInstance(r4)
            if (r2 == 0) goto L8
            r6 = 1
            return r6
        L1e:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.network.util.ConnectivityUtil.handleCompositeException(io.reactivex.exceptions.CompositeException, java.lang.Class):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: is */
    public static boolean m38729is(Object obj, Class cls) {
        boolean $z0 = obj instanceof CompositeException;
        if (!$z0) {
            boolean $z02 = cls.isInstance(obj);
            return $z02;
        }
        CompositeException $r2 = (CompositeException) obj;
        boolean $z03 = handleCompositeException($r2, cls);
        return $z03;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static boolean isConnected(Context context) {
        Object $r1 = context.getSystemService("connectivity");
        ConnectivityManager $r2 = (ConnectivityManager) $r1;
        NetworkInfo $r3 = $r2.getActiveNetworkInfo();
        if ($r3 != null) {
            boolean $z0 = $r3.isConnectedOrConnecting();
            return $z0;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static boolean isNoConnectivity(Throwable th) {
        th.printStackTrace();
        boolean $z0 = m38729is(th, NoConnectivityException.class);
        if ($z0) {
            return true;
        }
        boolean $z02 = m38729is(th, ConnectException.class);
        if ($z02) {
            return true;
        }
        boolean $z03 = m38729is(th, SocketTimeoutException.class);
        if ($z03) {
            return true;
        }
        boolean $z04 = m38729is(th, UnknownHostException.class);
        if ($z04) {
            return true;
        }
        boolean $z05 = m38729is(th, SSLHandshakeException.class);
        return $z05;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Object throwNetworkOrNot(Throwable th) throws Exception {
        boolean $z0 = th instanceof NoConnectivityException;
        if (!$z0) {
            Exception $r3 = new Exception(th);
            throw $r3;
        }
        String $r0 = th.getMessage();
        NoConnectivityException $r2 = new NoConnectivityException($r0);
        throw $r2;
    }
}
