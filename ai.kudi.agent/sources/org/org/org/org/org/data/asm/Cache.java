package org.org.org.org.org.data.asm;

import e.a.a.a.f.z.c;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
/* loaded from: classes.dex */
public final class Cache extends HashMap<String, e.a.a.a.c.f.d.a> implements c {

    /* renamed from: c */
    public static final C14694a f32737c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14694a $r0 = new C14694a(null);
        f32737c = $r0;
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
        boolean $z0 = obj instanceof Attribute;
        if ($z0) {
            Attribute $r2 = (Attribute) obj;
            boolean $z02 = containsValue($r2);
            return $z02;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ boolean containsValue(Attribute attribute) {
        boolean $z0 = super.containsValue((Object) attribute);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ Set createEntrySet() {
        Set $r1 = super.entrySet();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        Set $r1 = createEntrySet();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject equals() {
        /*
            r12 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r1 = r12.entrySet()
            java.util.Iterator r2 = r1.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r4 = r2.next()
            r6 = r4
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            r5 = r6
            java.lang.Object r4 = r5.getKey()
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            r7 = r8
            java.lang.Object r4 = r5.getValue()
            r10 = r4
            org.org.org.org.org.data.asm.Attribute r10 = (org.org.org.org.org.data.asm.Attribute) r10
            r9 = r10
            org.json.JSONObject r11 = r9.equals()
            r0.put(r7, r11)
            goto Ld
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.data.asm.Cache.equals():org.json.JSONObject");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        boolean $z0 = obj instanceof String;
        if ($z0) {
            String $r3 = (String) obj;
            Attribute $r1 = set($r3);
            return $r1;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ Attribute get(String str) {
        Object $r1 = super.remove(str);
        Attribute $r3 = (Attribute) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ Attribute get(String str, Attribute attribute) {
        Object $r2 = super.getOrDefault(str, attribute);
        Attribute $r1 = (Attribute) $r2;
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
            Attribute $r1 = (Attribute) obj2;
            return get($r4, $r1);
        }
        return obj2;
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
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        boolean $z0 = obj instanceof String;
        if ($z0) {
            String $r3 = (String) obj;
            Attribute $r1 = get($r3);
            return $r1;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        boolean $z0 = obj instanceof String;
        if ($z0) {
            boolean $z02 = obj2 instanceof Attribute;
            if ($z02) {
                String $r3 = (String) obj;
                Attribute $r4 = (Attribute) obj2;
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
    public /* bridge */ boolean remove(String str, Attribute attribute) {
        boolean $z0 = super.remove((Object) str, (Object) attribute);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ Attribute set(String str) {
        Object $r1 = super.get((Object) str);
        Attribute $r3 = (Attribute) $r1;
        return $r3;
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
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        Collection $r1 = getValues();
        return $r1;
    }
}
