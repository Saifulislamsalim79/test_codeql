package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.p102o.C2956c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.util.p */
/* loaded from: classes2.dex */
public class C2977p {

    /* renamed from: a */
    private static final Method f8148a;

    /* renamed from: b */
    private static final Method f8149b;

    /* renamed from: c */
    private static final Method f8150c;

    /* renamed from: d */
    private static final Method f8151d;

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:2|3)|4|(16:47|48|7|8|9|10|11|12|13|(2:39|40)|15|(2:34|35)|17|(2:29|30)|19|(3:21|22|23)(1:28))|6|7|8|9|10|11|12|13|(0)|15|(0)|17|(0)|19|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            android.os.Process.myUid()
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L17
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L17
            r5[r4] = r6     // Catch: java.lang.Exception -> L17
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.reflect.Method r5 = r6.getMethod(r1, r5)     // Catch: java.lang.Exception -> L17
            goto L18
        L17:
            r5 = r2
        L18:
            com.google.android.gms.common.util.C2977p.f8148a = r5
            boolean r5 = com.google.android.gms.common.util.C2974l.m31520c()
            r6 = 2
            if (r5 == 0) goto L30
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L30
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L30
            r5[r4] = r7     // Catch: java.lang.Exception -> L30
            r5[r3] = r0     // Catch: java.lang.Exception -> L30
            java.lang.Class<android.os.WorkSource> r7 = android.os.WorkSource.class
            java.lang.reflect.Method r1 = r7.getMethod(r1, r5)     // Catch: java.lang.Exception -> L30
            goto L31
        L30:
            r1 = r2
        L31:
            com.google.android.gms.common.util.C2977p.f8149b = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L3e
            goto L3f
        L3e:
            r1 = r2
        L3f:
            com.google.android.gms.common.util.C2977p.f8150c = r1
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L4f
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4f
            r1[r4] = r5     // Catch: java.lang.Exception -> L4f
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.String r7 = "get"
            r5.getMethod(r7, r1)     // Catch: java.lang.Exception -> L4f
            goto L50
        L4f:
        L50:
            boolean r1 = com.google.android.gms.common.util.C2974l.m31520c()
            if (r1 == 0) goto L66
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L65
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L65
            r1[r4] = r5     // Catch: java.lang.Exception -> L65
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.String r7 = "getName"
            java.lang.reflect.Method r2 = r5.getMethod(r7, r1)     // Catch: java.lang.Exception -> L65
            goto L66
        L65:
        L66:
            com.google.android.gms.common.util.C2977p.f8151d = r2
            boolean r1 = com.google.android.gms.common.util.C2974l.m31514i()
            java.lang.String r2 = "WorkSourceUtil"
            if (r1 == 0) goto L80
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "createWorkChain"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L7a
            r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L7a
            goto L80
        L7a:
            r1 = move-exception
            java.lang.String r5 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r2, r5, r1)
        L80:
            boolean r1 = com.google.android.gms.common.util.C2974l.m31514i()
            if (r1 == 0) goto La0
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L9a
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L9a
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L9a
            r5[r4] = r6     // Catch: java.lang.Exception -> L9a
            r5[r3] = r0     // Catch: java.lang.Exception -> L9a
            java.lang.String r0 = "addNode"
            r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L9a
            goto La0
        L9a:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r2, r1, r0)
        La0:
            boolean r0 = com.google.android.gms.common.util.C2974l.m31514i()
            if (r0 == 0) goto Lb3
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> Lb3
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> Lb3
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> Lb3
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C2977p.<clinit>():void");
    }

    /* renamed from: a */
    public static void m31508a(WorkSource workSource, int i, String str) {
        Method method = f8149b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = f8148a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    /* renamed from: b */
    public static WorkSource m31507b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo m31553c = C2956c.m31548a(context).m31553c(str, 0);
                if (m31553c == null) {
                    Log.e("WorkSourceUtil", str.length() != 0 ? "Could not get applicationInfo from package: ".concat(str) : new String("Could not get applicationInfo from package: "));
                    return null;
                }
                int i = m31553c.uid;
                WorkSource workSource = new WorkSource();
                m31508a(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", str.length() != 0 ? "Could not find package: ".concat(str) : new String("Could not find package: "));
            }
        }
        return null;
    }

    /* renamed from: c */
    public static List<String> m31506c(WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int m31504e = workSource == null ? 0 : m31504e(workSource);
        if (m31504e != 0) {
            for (int i = 0; i < m31504e; i++) {
                Method method = f8151d;
                String str = null;
                if (method != null) {
                    try {
                        str = (String) method.invoke(workSource, Integer.valueOf(i));
                    } catch (Exception e) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                    }
                }
                if (!n.b(str)) {
                    com.google.android.gms.common.internal.s.j(str);
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static boolean m31505d(Context context) {
        return (context == null || context.getPackageManager() == null || C2956c.m31548a(context).m31554b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    /* renamed from: e */
    public static int m31504e(WorkSource workSource) {
        Method method = f8150c;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                com.google.android.gms.common.internal.s.j(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }
}
