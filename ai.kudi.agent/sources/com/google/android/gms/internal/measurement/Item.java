package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public interface Item {

    /* renamed from: b */
    public static final Item f9171b;

    /* renamed from: c */
    public static final Item f9172c;

    /* renamed from: d */
    public static final Item f9173d;

    /* renamed from: g */
    public static final Item f9174g;

    /* renamed from: h */
    public static final Item f9175h;

    /* renamed from: i */
    public static final Item f9176i;

    /* renamed from: j */
    public static final Item f9177j;

    /* renamed from: k */
    public static final Item f9178k;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        C4027v r6 = new C4027v();
        Item r11 = (Item) r6;
        f9172c = r11;
        C3917o r7 = new C3917o();
        Item r112 = (Item) r7;
        f9171b = r112;
        C3806h r8 = new C3806h("continue");
        Item r113 = (Item) r8;
        f9177j = r113;
        C3806h r82 = new C3806h("break");
        Item r114 = (Item) r82;
        f9178k = r114;
        C3806h r83 = new C3806h("return");
        Item r115 = (Item) r83;
        f9176i = r115;
        Boolean $r4 = Boolean.TRUE;
        C3790g r9 = new C3790g($r4);
        Item r116 = (Item) r9;
        f9174g = r116;
        Boolean $r42 = Boolean.FALSE;
        C3790g r92 = new C3790g($r42);
        Item r117 = (Item) r92;
        f9173d = r117;
        C4011u r10 = new C4011u("");
        Item r118 = (Item) r10;
        f9175h = r118;
    }

    /* renamed from: a */
    Item m29863a();

    Double add();

    /* renamed from: b */
    Iterator m29862b();

    Boolean delete();

    String getKey();

    Item initPrototypeId(String str, C3968r4 c3968r4, List list);
}
