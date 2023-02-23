package org.org.org.org.internal.app;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* loaded from: classes.dex */
public final class Label implements Object {

    /* renamed from: b */
    public static final C14625h f32406b;

    /* renamed from: a */
    public final String f32407a;

    /* renamed from: c */
    public final boolean f32408c;

    /* renamed from: d */
    public final String f32409d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14625h $r0 = new C14625h(null);
        f32406b = $r0;
    }

    public Label(boolean z, String str, String str2) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        Log_OC.getArray(str2, MetricTracker.Object.MESSAGE);
        this.f32408c = z;
        this.f32409d = str;
        this.f32407a = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final String m1022a() {
        String r1 = this.f32407a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        boolean $z0 = this.f32408c;
        $r1.put("ok", $z0);
        String $r2 = this.f32409d;
        $r1.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, $r2);
        String $r22 = this.f32407a;
        $r1.put(MetricTracker.Object.MESSAGE, $r22);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Label;
            if ($z0) {
                Label $r2 = (Label) obj;
                boolean $z02 = this.f32408c;
                boolean $z1 = $r2.f32408c;
                if ($z02 == $z1) {
                    String $r3 = this.f32409d;
                    String $r4 = $r2.f32409d;
                    boolean $z03 = Log_OC.append($r3, $r4);
                    if ($z03) {
                        String $r32 = this.f32407a;
                        String $r42 = $r2.f32407a;
                        boolean $z04 = Log_OC.append($r32, $r42);
                        return $z04;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        boolean $z0 = this.f32408c;
        if ($z0) {
            $z0 = true;
        }
        int $i1 = $z0 ? 1 : 0;
        int $i0 = $i1 * 31;
        String $r1 = this.f32409d;
        int $i2 = $r1 != null ? $r1.hashCode() : 0;
        int $i02 = ($i0 + $i2) * 31;
        String $r12 = this.f32407a;
        int $i12 = $r12 != null ? $r12.hashCode() : 0;
        return $i02 + $i12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("ErrorResponse(ok=");
        boolean $z0 = this.f32408c;
        $r2.append($z0);
        $r2.append(", error=");
        String $r1 = this.f32409d;
        $r2.append($r1);
        $r2.append(", message=");
        String $r12 = this.f32407a;
        $r2.append($r12);
        $r2.append(")");
        String $r13 = $r2.toString();
        return $r13;
    }
}
