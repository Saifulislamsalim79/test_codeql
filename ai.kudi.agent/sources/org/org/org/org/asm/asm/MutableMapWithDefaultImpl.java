package org.org.org.org.asm.asm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import kotlin.C13287o;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class MutableMapWithDefaultImpl extends HashMap<String, C13287o<? extends Object, ? extends Boolean>> {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void forKeyValue(java.util.HashMap r14, kotlin.p483e0.p484c.InterfaceC11772q r15) {
        /*
            r13 = this;
            java.util.Set r0 = r14.keySet()
            java.lang.String r1 = "this.keys"
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r1)
            java.util.Iterator r2 = r0.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L52
            java.lang.Object r4 = r2.next()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r5 = r6
            java.lang.String r1 = "key"
            kotlin.p483e0.p485d.Log_OC.loadImage(r5, r1)
            java.lang.Object r4 = r14.get(r5)
            r8 = r4
            kotlin.o r8 = (kotlin.C13287o) r8
            r7 = r8
            if (r7 == 0) goto L2f
            java.lang.Object r4 = r7.m5364c()
            goto L30
        L2f:
            r4 = 0
        L30:
            java.lang.Object r9 = r14.get(r5)
            r10 = r9
            kotlin.o r10 = (kotlin.C13287o) r10
            r7 = r10
            if (r7 == 0) goto L49
            java.lang.Object r9 = r7.m5363d()
            r12 = r9
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r11 = r12
            if (r11 == 0) goto L49
            boolean r3 = r11.booleanValue()
            goto L4a
        L49:
            r3 = 0
        L4a:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r15.invoke(r5, r4, r11)
            goto Ld
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.asm.MutableMapWithDefaultImpl.forKeyValue(java.util.HashMap, kotlin.e0.c.q):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void putValue$default(MutableMapWithDefaultImpl mutableMapWithDefaultImpl, String str, Object obj, boolean $z0, int i, Object obj2) {
        if (obj2 != null) {
            UnsupportedOperationException $r4 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putValue");
            throw $r4;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $z0 = false;
        }
        mutableMapWithDefaultImpl.putValue(str, obj, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        boolean $z0 = obj instanceof String;
        if ($z0) {
            String $r2 = (String) obj;
            boolean $z02 = containsKey($r2);
            return $z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ boolean containsKey(String str) {
        boolean $z0 = super.containsKey((Object) str);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        boolean $z0 = obj instanceof C13287o;
        if ($z0) {
            C13287o $r2 = (C13287o) obj;
            boolean $z02 = containsValue($r2);
            return $z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ boolean containsValue(C13287o c13287o) {
        boolean $z0 = super.containsValue((Object) c13287o);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        Set $r1 = getEntries();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        boolean $z0 = obj instanceof String;
        if ($z0) {
            String $r3 = (String) obj;
            C13287o $r1 = get($r3);
            return $r1;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ C13287o get(String str) {
        Object $r1 = super.get((Object) str);
        C13287o $r3 = (C13287o) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ Set getEntries() {
        Set $r1 = super.entrySet();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ Set getKeys() {
        Set $r1 = super.keySet();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        boolean $z0 = obj instanceof String;
        if ($z0) {
            String $r4 = (String) obj;
            C13287o $r1 = (C13287o) obj2;
            return getOrDefault($r4, $r1);
        }
        return obj2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ C13287o getOrDefault(String str, C13287o c13287o) {
        Object $r2 = super.getOrDefault((Object) str, (String) c13287o);
        C13287o $r1 = (C13287o) $r2;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ int getSize() {
        int $i0 = super.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ Collection getValues() {
        Collection $r1 = super.values();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        Set $r1 = getKeys();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void putValue(String str, Object obj, boolean z) {
        Log_OC.getArray(str, "key");
        Log_OC.getArray(obj, "value");
        Object $r3 = get((Object) str);
        C13287o $r4 = (C13287o) $r3;
        if ($r4 != null) {
            Object $r32 = $r4.m5363d();
            Boolean $r5 = (Boolean) $r32;
            boolean $z1 = $r5.booleanValue();
            if ($z1) {
                return;
            }
        }
        Boolean $r52 = Boolean.valueOf(z);
        put(str, new C13287o(obj, $r52));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        boolean $z0 = obj instanceof String;
        if ($z0) {
            String $r3 = (String) obj;
            C13287o $r1 = remove($r3);
            return $r1;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ C13287o remove(String str) {
        Object $r1 = super.remove((Object) str);
        C13287o $r3 = (C13287o) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        boolean $z0 = obj instanceof String;
        if ($z0) {
            boolean $z02 = obj2 instanceof C13287o;
            if ($z02) {
                String $r3 = (String) obj;
                C13287o $r4 = (C13287o) obj2;
                boolean $z03 = remove($r3, $r4);
                return $z03;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ boolean remove(String str, C13287o c13287o) {
        boolean $z0 = super.remove((Object) str, (Object) c13287o);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        int $i0 = getSize();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Expression toJSONObjectPair() {
        JSONObject $r1 = new JSONObject();
        JSONObject $r2 = new JSONObject();
        ByteVector $r3 = new ByteVector($r1, $r2);
        forKeyValue(this, $r3);
        Expression $r4 = new Expression($r1, $r2);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        Collection $r1 = getValues();
        return $r1;
    }
}
