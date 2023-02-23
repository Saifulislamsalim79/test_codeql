package org.org.org.org.asm;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public final class ClassWriter {

    /* renamed from: c */
    public static final ClassWriter f32305c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        ClassWriter $r0 = new ClassWriter();
        f32305c = $r0;
    }

    private ClassWriter() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private final Object execute(String str, Object obj) throws NoSuchFieldException, IllegalAccessException {
        Class $r3 = obj.getClass();
        Field $r4 = getField(str, $r3);
        $r4.setAccessible(true);
        Object $r1 = $r4.get(obj);
        return $r1;
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
    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.reflect.Field getField(java.lang.String r16, java.lang.Class r17) throws java.lang.NoSuchFieldException {
        /*
            r15 = this;
            r1 = r17
        L2:
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r2 = kotlin.p483e0.p485d.Log_OC.append(r1, r3)
            r4 = 1
            r2 = r2 ^ r4
            if (r2 == 0) goto L3b
            java.lang.reflect.Field[] r5 = r1.getDeclaredFields()
            int r6 = r5.length
            r7 = 0
        L12:
            if (r7 >= r6) goto L2b
            r8 = r5[r7]
            java.lang.String r9 = "field"
            kotlin.p483e0.p485d.Log_OC.loadImage(r8, r9)
            java.lang.String r10 = r8.getName()
            r0 = r16
            boolean r2 = kotlin.p483e0.p485d.Log_OC.append(r0, r10)
            if (r2 == 0) goto L28
            return r8
        L28:
            int r7 = r7 + 1
            goto L12
        L2b:
            java.lang.Class r11 = r1.getSuperclass()
            r1 = r11
            if (r11 == 0) goto L33
            goto L2
        L33:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.Class<*>"
            r12.<init>(r9)
            throw r12
        L3b:
            java.lang.NoSuchFieldException r13 = new java.lang.NoSuchFieldException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r9 = "Field "
            r14.append(r9)
            r0 = r16
            r14.append(r0)
            java.lang.String r9 = " not found for class "
            r14.append(r9)
            r0 = r17
            r14.append(r0)
            java.lang.String r16 = r14.toString()
            r0 = r16
            r13.<init>(r0)
            goto L60
        L60:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.ClassWriter.getField(java.lang.String, java.lang.Class):java.lang.reflect.Field");
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
    public static /* synthetic */ Object put(ClassWriter classWriter, Class cls, Object obj, String str, Class cls2, Class[] $r5, Object[] $r6, int i, Object obj2) {
        int $i1 = i & 16;
        if ($i1 != 0) {
            $r5 = new Class[0];
        }
        int $i0 = i & 32;
        if ($i0 != 0) {
            $r6 = new Object[0];
        }
        Object $r2 = classWriter.get(cls, obj, str, cls2, $r5, $r6);
        return $r2;
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
    public static /* synthetic */ Object put(ClassWriter classWriter, String str, String str2, Class cls, Class[] $r3, Object[] $r6, int i, Object obj) {
        int $i1 = i & 8;
        if ($i1 != 0) {
            $r3 = new Class[0];
        }
        int $i0 = i & 16;
        if ($i0 != 0) {
            $r6 = new Object[0];
        }
        Object $r4 = classWriter.get(str, str2, cls, $r3, $r6);
        return $r4;
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
    public final Object get(View view, List list, List list2, Class cls) {
        Object $r6;
        Log_OC.getArray(view, "rootObject");
        Log_OC.getArray(list, "classConditions");
        Log_OC.getArray(list2, "fieldNames");
        Log_OC.getArray(cls, "returnType");
        int $i0 = list.size();
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            try {
                $r6 = list.get($i1);
            } catch (Exception e) {
            }
            if ($r6 != null) {
                Class $r7 = view.getClass();
                Object $r62 = list.get($i1);
                Log_OC.append($r62);
                String $r8 = (String) $r62;
                Class $r9 = Class.forName($r8);
                boolean $z0 = Log_OC.append($r7, $r9);
                if (!$z0) {
                    continue;
                }
            }
            Object $r63 = list2.get($i1);
            String $r82 = (String) $r63;
            Object $r64 = get($r82, view);
            return cls.cast($r64);
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Object get(Class cls, Object obj, String str, Class cls2, Class[] clsArr, Object[] objArr) {
        Log_OC.getArray(cls, "clazz");
        Log_OC.getArray(obj, "instance");
        Log_OC.getArray(str, "methodName");
        Log_OC.getArray(cls2, "returnType");
        Log_OC.getArray(clsArr, "parameterTypes");
        Log_OC.getArray(objArr, "parameters");
        int $i0 = clsArr.length;
        Object[] $r7 = Arrays.copyOf(clsArr, $i0);
        Class[] $r6 = (Class[]) $r7;
        Method $r8 = cls.getDeclaredMethod(str, $r6);
        $r8.setAccessible(true);
        int $i02 = objArr.length;
        Object[] $r3 = Arrays.copyOf(objArr, $i02);
        Object $r1 = $r8.invoke(obj, $r3);
        return cls2.cast($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Object get(String str, Object obj) throws NoSuchFieldException, IllegalAccessException {
        Log_OC.getArray(str, "fieldName");
        Log_OC.getArray(obj, "target");
        Object $r1 = execute(str, obj);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Object get(String str, String str2, Class cls, Class[] clsArr, Object[] objArr) {
        Log_OC.getArray(str, "className");
        Log_OC.getArray(str2, "methodName");
        Log_OC.getArray(cls, "returnType");
        Log_OC.getArray(clsArr, "parameterTypes");
        Log_OC.getArray(objArr, "parameters");
        Class $r6 = Class.forName(str);
        int $i0 = clsArr.length;
        Object[] $r7 = Arrays.copyOf(clsArr, $i0);
        Class[] $r5 = (Class[]) $r7;
        Method $r8 = $r6.getDeclaredMethod(str2, $r5);
        int $i02 = objArr.length;
        Object[] $r2 = Arrays.copyOf(objArr, $i02);
        Object $r9 = $r8.invoke(null, $r2);
        return cls.cast($r9);
    }
}
