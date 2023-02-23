package org.org.org.org.org.common;

import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.org.common.telemetry.Item;
/* loaded from: classes.dex */
public final class ByteVector {

    /* renamed from: a */
    public Integer f32518a;

    /* renamed from: b */
    public final String f32519b;

    /* renamed from: l */
    public Item f32520l;

    /* renamed from: n */
    public final long f32521n;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ByteVector(String str, Item item, long j) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(item, "currentRecord");
        this.f32519b = str;
        this.f32521n = j;
        this.f32520l = item;
        int $i1 = item.getType();
        Integer $r3 = Integer.valueOf($i1);
        this.f32518a = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final String m942a() {
        String r1 = this.f32519b;
        return r1;
    }

    /* renamed from: a */
    public final void m941a(Integer num) {
        this.f32518a = num;
    }

    /* renamed from: a */
    public final void m940a(Item item) {
        this.f32520l = item;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long get() {
        long $l1 = System.currentTimeMillis();
        long $l0 = this.f32521n;
        return $l1 - $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Item getSize() {
        Item r1 = this.f32520l;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Integer getValue() {
        Integer r1 = this.f32518a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long length() {
        long l0 = this.f32521n;
        return l0;
    }
}
