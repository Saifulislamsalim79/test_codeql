package org.org.org.org.android.http.util;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONArray;
import org.json.JSONObject;
import org.org.org.org.android.model.data.Item;
import org.org.org.org.asm.util.Collection;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* loaded from: classes.dex */
public final class Label extends Item {

    /* renamed from: i */
    public static final C14533a f32086i;

    /* renamed from: a */
    public final String f32087a;

    /* renamed from: b */
    public final boolean f32088b;

    /* renamed from: c */
    public final int f32089c;
    public final long count;

    /* renamed from: d */
    public final String f32090d;

    /* renamed from: f */
    public final List<e.a.a.a.a.c.b.a> f32091f;

    /* renamed from: g */
    public final List<e.a.a.a.a.c.b.a> f32092g;

    /* renamed from: h */
    public final String f32093h;

    /* renamed from: k */
    public final Item f32094k;
    public final String text;
    public final String url;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14533a $r0 = new C14533a(null);
        f32086i = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Label(long r29, long r31, java.lang.String r33, org.org.org.org.android.http.filter.AbstractC14532f r34) {
        /*
            r28 = this;
            java.lang.String r13 = "status"
            r0 = r33
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r13)
            java.lang.String r13 = "requestParser"
            r0 = r34
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r13)
            r0 = r34
            java.lang.String r14 = r0.m1383f()
            r0 = r34
            java.lang.String r15 = r0.m1384e()
            r17 = 0
            r0 = r34
            r1 = r17
            java.util.List r16 = r0.m1390a(r1)
            r17 = 1
            r0 = r34
            r1 = r17
            java.util.List r18 = r0.m1390a(r1)
            r0 = r34
            java.lang.String r19 = r0.getResources()
            r0 = r34
            java.lang.String r20 = r0.m1385d()
            r0 = r34
            int r21 = r0.m1380i()
            r0 = r34
            boolean r22 = r0.m1379l()
            org.org.org.org.android.model.data.Item r23 = new org.org.org.org.android.model.data.Item
            r24 = 0
            r25 = 0
            r26 = 0
            r17 = 13
            r27 = 0
            r0 = r23
            r1 = r24
            r2 = r29
            r4 = r25
            r5 = r26
            r6 = r17
            r7 = r27
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r0 = r28
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r31
            r9 = r33
            r10 = r21
            r11 = r22
            r12 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.http.util.Label.<init>(long, long, java.lang.String, org.org.org.org.android.http.filter.f):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Label(String str, String str2, List list, List list2, String str3, String str4, long j, String str5, int i, boolean z, Item item) {
        super(item);
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        Log_OC.getArray(str2, "method");
        Log_OC.getArray(list, "requestHeaders");
        Log_OC.getArray(list2, "responseHeaders");
        Log_OC.getArray(str3, "protocol");
        Log_OC.getArray(str4, "initiator");
        Log_OC.getArray(str5, TransactionField.STATUS);
        Log_OC.getArray(item, "eventBase");
        this.f32090d = str;
        this.f32087a = str2;
        this.f32091f = list;
        this.f32092g = list2;
        this.f32093h = str3;
        this.url = str4;
        this.count = j;
        this.text = str5;
        this.f32089c = i;
        this.f32088b = z;
        this.f32094k = item;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.android.model.data.Item, org.org.org.org.asm.menu.Object
    public JSONObject equals() {
        JSONObject $r1 = new JSONObject();
        String $r2 = this.f32090d;
        $r1.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, $r2);
        String $r22 = this.f32087a;
        $r1.put("method", $r22);
        List $r3 = this.f32091f;
        JSONArray $r4 = Collection.add($r3);
        $r1.put("request_headers", $r4);
        List $r32 = this.f32092g;
        JSONArray $r42 = Collection.add($r32);
        $r1.put("response_headers", $r42);
        String $r23 = this.f32093h;
        $r1.put("protocol", $r23);
        String $r24 = this.url;
        $r1.put("initiator", $r24);
        long $l0 = this.count;
        $r1.put("duration", $l0);
        String $r25 = this.text;
        $r1.put(TransactionField.STATUS, $r25);
        int $i1 = this.f32089c;
        $r1.put("statusCode", $i1);
        boolean $z0 = this.f32088b;
        $r1.put("cached", $z0);
        update($r1);
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
                String $r3 = this.f32090d;
                String $r4 = $r2.f32090d;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.f32087a;
                    String $r42 = $r2.f32087a;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        List $r5 = this.f32091f;
                        List $r6 = $r2.f32091f;
                        boolean $z04 = Log_OC.append($r5, $r6);
                        if ($z04) {
                            List $r52 = this.f32092g;
                            List $r62 = $r2.f32092g;
                            boolean $z05 = Log_OC.append($r52, $r62);
                            if ($z05) {
                                String $r33 = this.f32093h;
                                String $r43 = $r2.f32093h;
                                boolean $z06 = Log_OC.append($r33, $r43);
                                if ($z06) {
                                    String $r34 = this.url;
                                    String $r44 = $r2.url;
                                    boolean $z07 = Log_OC.append($r34, $r44);
                                    if ($z07) {
                                        long $l2 = this.count;
                                        long $l0 = $r2.count;
                                        if ($l2 == $l0) {
                                            String $r35 = this.text;
                                            String $r45 = $r2.text;
                                            boolean $z08 = Log_OC.append($r35, $r45);
                                            if ($z08) {
                                                int $i3 = this.f32089c;
                                                int $i4 = $r2.f32089c;
                                                if ($i3 == $i4) {
                                                    boolean $z09 = this.f32088b;
                                                    boolean $z1 = $r2.f32088b;
                                                    if ($z09 == $z1) {
                                                        Item $r7 = this.f32094k;
                                                        Item $r72 = $r2.f32094k;
                                                        boolean $z010 = Log_OC.append($r7, $r72);
                                                        return $z010;
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
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String $r1 = this.f32090d;
        int $i1 = $r1 != null ? $r1.hashCode() : 0;
        int $i12 = $i1 * 31;
        String $r12 = this.f32087a;
        int $i2 = $r12 != null ? $r12.hashCode() : 0;
        int $i13 = ($i12 + $i2) * 31;
        List $r2 = this.f32091f;
        int $i22 = $r2 != null ? $r2.hashCode() : 0;
        int $i14 = ($i13 + $i22) * 31;
        List $r22 = this.f32092g;
        int $i23 = $r22 != null ? $r22.hashCode() : 0;
        int $i15 = ($i14 + $i23) * 31;
        String $r13 = this.f32093h;
        int $i24 = $r13 != null ? $r13.hashCode() : 0;
        int $i16 = ($i15 + $i24) * 31;
        String $r14 = this.url;
        int $i25 = $r14 != null ? $r14.hashCode() : 0;
        long $l3 = this.count;
        int $i26 = Version$BuildAwareOrder.compare($l3);
        int $i17 = ((($i16 + $i25) * 31) + $i26) * 31;
        String $r15 = this.text;
        int $i27 = $r15 != null ? $r15.hashCode() : 0;
        int $i28 = this.f32089c;
        int $i18 = ((($i17 + $i27) * 31) + $i28) * 31;
        boolean $z0 = this.f32088b;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i29 = i;
        int $i19 = ($i18 + $i29) * 31;
        Item $r3 = this.f32094k;
        int $i0 = $r3 != null ? $r3.hashCode() : 0;
        return $i19 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("InterceptedRequest(url=");
        String $r1 = this.f32090d;
        $r2.append($r1);
        $r2.append(", method=");
        String $r12 = this.f32087a;
        $r2.append($r12);
        $r2.append(", requestHeaders=");
        List $r3 = this.f32091f;
        $r2.append($r3);
        $r2.append(", responseHeaders=");
        List $r32 = this.f32092g;
        $r2.append($r32);
        $r2.append(", protocol=");
        String $r13 = this.f32093h;
        $r2.append($r13);
        $r2.append(", initiator=");
        String $r14 = this.url;
        $r2.append($r14);
        $r2.append(", duration=");
        long $l0 = this.count;
        $r2.append($l0);
        $r2.append(", status=");
        String $r15 = this.text;
        $r2.append($r15);
        $r2.append(", statusCode=");
        int $i1 = this.f32089c;
        $r2.append($i1);
        $r2.append(", cached=");
        boolean $z0 = this.f32088b;
        $r2.append($z0);
        $r2.append(", eventBase=");
        Item $r4 = this.f32094k;
        $r2.append($r4);
        $r2.append(")");
        String $r16 = $r2.toString();
        return $r16;
    }
}
