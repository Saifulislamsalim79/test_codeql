package org.org.org.org.internal.app.api;

import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* loaded from: classes.dex */
public final class Label implements Object {

    /* renamed from: j */
    public static final C14623a f32410j;

    /* renamed from: a */
    public final C14624h f32411a;

    /* renamed from: b */
    public final org.org.org.org.internal.app.Label f32412b;

    /* renamed from: c */
    public final String f32413c;

    /* renamed from: d */
    public final String f32414d;

    /* renamed from: g */
    public final Message f32415g;

    /* renamed from: h */
    public final boolean f32416h;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14623a $r0 = new C14623a(null);
        f32410j = $r0;
    }

    public Label(boolean z, String str, String str2, C14624h c14624h, org.org.org.org.internal.app.Label label, Message message) {
        this.f32416h = z;
        this.f32414d = str;
        this.f32413c = str2;
        this.f32411a = c14624h;
        this.f32412b = label;
        this.f32415g = message;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final org.org.org.org.internal.app.Label m1021a() {
        org.org.org.org.internal.app.Label r1 = this.f32412b;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final boolean m1020b() {
        boolean z0 = this.f32416h;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final C14624h m1019c() {
        C14624h r1 = this.f32411a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m1018e() {
        String r1 = this.f32414d;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        boolean $z0 = this.f32416h;
        $r1.put("recordingAllowed", $z0);
        String $r2 = this.f32414d;
        $r1.put("visitorUrlPattern", $r2);
        String $r22 = this.f32413c;
        $r1.put("sessionUrlPattern", $r22);
        org.org.org.org.internal.app.Label $r3 = this.f32412b;
        JSONObject $r5 = $r3 != null ? $r3.equals() : null;
        $r1.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, $r5);
        C14624h $r6 = this.f32411a;
        JSONObject $r52 = $r6 != null ? $r6.equals() : null;
        $r1.put("recording", $r52);
        Message $r7 = this.f32415g;
        JSONObject $r4 = $r7 != null ? $r7.equals() : null;
        $r1.put("consent", $r4);
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
                boolean $z02 = this.f32416h;
                boolean $z1 = $r2.f32416h;
                if ($z02 == $z1) {
                    String $r3 = this.f32414d;
                    String $r4 = $r2.f32414d;
                    boolean $z03 = Log_OC.append($r3, $r4);
                    if ($z03) {
                        String $r32 = this.f32413c;
                        String $r42 = $r2.f32413c;
                        boolean $z04 = Log_OC.append($r32, $r42);
                        if ($z04) {
                            C14624h $r5 = this.f32411a;
                            C14624h $r6 = $r2.f32411a;
                            boolean $z05 = Log_OC.append($r5, $r6);
                            if ($z05) {
                                org.org.org.org.internal.app.Label $r7 = this.f32412b;
                                org.org.org.org.internal.app.Label $r8 = $r2.f32412b;
                                boolean $z06 = Log_OC.append($r7, $r8);
                                if ($z06) {
                                    Message $r9 = this.f32415g;
                                    Message $r10 = $r2.f32415g;
                                    boolean $z07 = Log_OC.append($r9, $r10);
                                    return $z07;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
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
    public final String getName() {
        String r1 = this.f32413c;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        boolean $z0 = this.f32416h;
        if ($z0) {
            $z0 = true;
        }
        int $i1 = $z0 ? 1 : 0;
        int $i0 = $i1 * 31;
        String $r1 = this.f32414d;
        int $i2 = $r1 != null ? $r1.hashCode() : 0;
        int $i02 = ($i0 + $i2) * 31;
        String $r12 = this.f32413c;
        int $i22 = $r12 != null ? $r12.hashCode() : 0;
        int $i03 = ($i02 + $i22) * 31;
        C14624h $r2 = this.f32411a;
        int $i23 = $r2 != null ? $r2.hashCode() : 0;
        int $i04 = ($i03 + $i23) * 31;
        org.org.org.org.internal.app.Label $r3 = this.f32412b;
        int $i24 = $r3 != null ? $r3.hashCode() : 0;
        int $i05 = ($i04 + $i24) * 31;
        Message $r4 = this.f32415g;
        int $i12 = $r4 != null ? $r4.hashCode() : 0;
        return $i05 + $i12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("CheckRecordingConfigResponse(recordingAllowed=");
        boolean $z0 = this.f32416h;
        $r2.append($z0);
        $r2.append(", visitorUrlPattern=");
        String $r1 = this.f32414d;
        $r2.append($r1);
        $r2.append(", sessionUrlPattern=");
        String $r12 = this.f32413c;
        $r2.append($r12);
        $r2.append(", recording=");
        C14624h $r3 = this.f32411a;
        $r2.append($r3);
        $r2.append(", error=");
        org.org.org.org.internal.app.Label $r4 = this.f32412b;
        $r2.append($r4);
        $r2.append(", consent=");
        Message $r5 = this.f32415g;
        $r2.append($r5);
        $r2.append(")");
        String $r13 = $r2.toString();
        return $r13;
    }
}
