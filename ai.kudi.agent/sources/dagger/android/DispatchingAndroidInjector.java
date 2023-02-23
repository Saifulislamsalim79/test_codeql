package dagger.android;

import java.util.ArrayList;
import java.util.Map;
import p382i.p383b.C9473g;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class DispatchingAndroidInjector<T> implements b<T> {

    /* renamed from: m */
    private final Map<String, InterfaceC11700a<b$a<?>>> f17584m;

    /* loaded from: classes2.dex */
    public static final class InvalidInjectorBindingException extends RuntimeException {
        InvalidInjectorBindingException(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public DispatchingAndroidInjector(Map map, Map map2) {
        Map $r2 = build(map, map2);
        this.f17584m = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0023 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.Map build(java.util.Map r12, java.util.Map r13) {
        /*
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L7
            return r13
        L7:
            int r1 = r12.size()
            int r2 = r13.size()
            int r1 = r1 + r2
            java.util.LinkedHashMap r3 = p382i.p383b.C9466b.m14659b(r1)
            r3.putAll(r13)
            java.util.Set r4 = r12.entrySet()
            java.util.Iterator r5 = r4.iterator()
        L1f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r6 = r5.next()
            r8 = r6
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            r7 = r8
            java.lang.Object r6 = r7.getKey()
            r10 = r6
            java.lang.Class r10 = (java.lang.Class) r10
            r9 = r10
            java.lang.String r11 = r9.getName()
            java.lang.Object r6 = r7.getValue()
            r3.put(r11, r6)
            goto L1f
        L41:
            java.util.Map r12 = java.util.Collections.unmodifiableMap(r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.android.DispatchingAndroidInjector.build(java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private String copy(Object obj) {
        ArrayList $r2 = new ArrayList();
        for (Class $r3 = obj.getClass(); $r3 != null; $r3 = $r3.getSuperclass()) {
            Map $r4 = this.f17584m;
            String $r5 = $r3.getCanonicalName();
            boolean $z0 = $r4.containsKey($r5);
            if ($z0) {
                String $r52 = $r3.getCanonicalName();
                $r2.add($r52);
            }
        }
        boolean $z02 = $r2.isEmpty();
        if ($z02) {
            Class $r32 = obj.getClass();
            String $r53 = $r32.getCanonicalName();
            Object[] $r6 = {$r53};
            String $r54 = String.format("No injector factory bound for Class<%s>", $r6);
            return $r54;
        }
        Class $r33 = obj.getClass();
        String $r55 = $r33.getCanonicalName();
        Object[] $r62 = {$r55, $r2};
        String $r56 = String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", $r62);
        return $r56;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public boolean m18757a(Object obj) {
        Map $r2 = this.f17584m;
        Class $r3 = obj.getClass();
        String $r4 = $r3.getName();
        Object $r5 = $r2.get($r4);
        InterfaceC11700a $r6 = (InterfaceC11700a) $r5;
        if ($r6 == null) {
            return false;
        }
        Object $r52 = $r6.get();
        b$a $r7 = (b$a) $r52;
        try {
            Registry $r8 = $r7.create((b$a) obj);
            Class $r32 = $r7.getClass();
            C9473g.m14648d($r8, "%s.create(I) should not return null.", $r32);
            $r8.inject(obj);
            return true;
        } catch (ClassCastException $r9) {
            Class $r33 = $r7.getClass();
            String $r42 = $r33.getCanonicalName();
            Class $r34 = obj.getClass();
            String $r43 = $r34.getCanonicalName();
            Object[] $r11 = {$r42, $r43};
            String $r44 = String.format("%s does not implement AndroidInjector.Factory<%s>", $r11);
            Throwable r12 = new InvalidInjectorBindingException($r44, $r9);
            Throwable r13 = r12;
            throw r13;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void inject(Object obj) {
        boolean $z0 = m18757a(obj);
        if ($z0) {
            return;
        }
        String $r3 = copy(obj);
        IllegalArgumentException $r2 = new IllegalArgumentException($r3);
        throw $r2;
    }
}
