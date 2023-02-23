package p201g.expandableListView;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
/* renamed from: g.expandableListView.MultiDex */
/* loaded from: classes.dex */
public final class MultiDex {
    private static final boolean IS_VM_MULTIDEX_CAPABLE;
    private static final Set<File> installedApk;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g.expandableListView.MultiDex$V19 */
    /* loaded from: classes.dex */
    public final class V19 {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        /* JADX WARN: Incorrect condition in loop: B:6:0x0033 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        static void install(java.lang.ClassLoader r25, java.util.List r26, java.io.File r27) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.io.IOException {
            /*
                java.lang.String r5 = "pathList"
                r0 = r25
                java.lang.reflect.Field r4 = p201g.expandableListView.MultiDex.access$getFindField(r0, r5)
                r0 = r25
                java.lang.Object r6 = r4.get(r0)
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.ArrayList r8 = new java.util.ArrayList
                r0 = r26
                r8.<init>(r0)
                r0 = r27
                java.lang.Object[] r9 = makeDexElements(r6, r8, r0, r7)
                java.lang.String r5 = "dexElements"
                p201g.expandableListView.MultiDex.access$getExpandFieldArray(r6, r5, r9)
                int r10 = r7.size()
                if (r10 <= 0) goto Lb3
                java.util.Iterator r11 = r7.iterator()
            L2f:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L47
                java.lang.Object r13 = r11.next()
                r15 = r13
                java.io.IOException r15 = (java.io.IOException) r15
                r14 = r15
                java.lang.String r5 = "MultiDex"
                java.lang.String r16 = "Exception in makeDexElement"
                r0 = r16
                android.util.Log.w(r5, r0, r14)
                goto L2f
            L47:
                java.lang.String r5 = "dexElementsSuppressedExceptions"
                java.lang.reflect.Field r4 = p201g.expandableListView.MultiDex.access$getFindField(r6, r5)
                java.lang.Object r13 = r4.get(r6)
                r18 = r13
                java.io.IOException[] r18 = (java.io.IOException[]) r18
                r17 = r18
                if (r17 != 0) goto L6c
                int r10 = r7.size()
                java.io.IOException[] r0 = new java.io.IOException[r10]
                r17 = r0
                java.lang.Object[] r9 = r7.toArray(r0)
                r19 = r9
                java.io.IOException[] r19 = (java.io.IOException[]) r19
                r17 = r19
                goto L93
            L6c:
                int r10 = r7.size()
                r0 = r17
                int r0 = r0.length
                r20 = r0
                int r10 = r10 + r0
                java.io.IOException[] r0 = new java.io.IOException[r10]
                r21 = r0
                r7.toArray(r0)
                int r20 = r7.size()
                r0 = r17
                int r10 = r0.length
                r22 = 0
                r0 = r17
                r1 = r22
                r2 = r21
                r3 = r20
                java.lang.System.arraycopy(r0, r1, r2, r3, r10)
                r17 = r21
            L93:
                r0 = r17
                r4.set(r6, r0)
                java.io.IOException r14 = new java.io.IOException
                java.lang.String r5 = "I/O exception during makeDexElement"
                r14.<init>(r5)
                r22 = 0
                r0 = r22
                java.lang.Object r6 = r7.get(r0)
                r24 = r6
                java.lang.Throwable r24 = (java.lang.Throwable) r24
                r23 = r24
                r0 = r23
                r14.initCause(r0)
                throw r14
            Lb3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p201g.expandableListView.MultiDex.V19.install(java.lang.ClassLoader, java.util.List, java.io.File):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        private static Object[] makeDexElements(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            Class[] $r4 = {ArrayList.class, File.class, ArrayList.class};
            Method $r5 = MultiDex.findMethod(obj, "makeDexElements", $r4);
            Object[] $r6 = {arrayList, file, arrayList2};
            Object $r3 = $r5.invoke(obj, $r6);
            return (Object[]) $r3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g.expandableListView.MultiDex$V4 */
    /* loaded from: classes.dex */
    public final class C7536V4 {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        /* JADX WARN: Incorrect condition in loop: B:4:0x002f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        static void install(java.lang.ClassLoader r22, java.util.List r23) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.io.IOException {
            /*
                r0 = r23
                int r2 = r0.size()
                java.lang.String r4 = "path"
                r0 = r22
                java.lang.reflect.Field r3 = p201g.expandableListView.MultiDex.access$getFindField(r0, r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r0 = r22
                java.lang.Object r6 = r3.get(r0)
                r8 = r6
                java.lang.String r8 = (java.lang.String) r8
                r7 = r8
                r5.<init>(r7)
                java.lang.String[] r9 = new java.lang.String[r2]
                java.io.File[] r10 = new java.io.File[r2]
                java.util.zip.ZipFile[] r11 = new java.util.zip.ZipFile[r2]
                dalvik.system.DexFile[] r12 = new dalvik.system.DexFile[r2]
                r0 = r23
                java.util.ListIterator r13 = r0.listIterator()
            L2b:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L80
                java.lang.Object r6 = r13.next()
                r16 = r6
                java.io.File r16 = (java.io.File) r16
                r15 = r16
                java.lang.String r7 = r15.getAbsolutePath()
                r17 = 58
                r0 = r17
                r5.append(r0)
                r5.append(r7)
                int r2 = r13.previousIndex()
                r9[r2] = r7
                r10[r2] = r15
                java.util.zip.ZipFile r18 = new java.util.zip.ZipFile
                r0 = r18
                r0.<init>(r15)
                r11[r2] = r18
                java.lang.StringBuilder r19 = new java.lang.StringBuilder
                r0 = r19
                r0.<init>()
                r0 = r19
                r0.append(r7)
                java.lang.String r4 = ".dex"
                r0 = r19
                r0.append(r4)
                r0 = r19
                java.lang.String r20 = r0.toString()
                r17 = 0
                r0 = r20
                r1 = r17
                dalvik.system.DexFile r21 = dalvik.system.DexFile.loadDex(r7, r0, r1)
                r12[r2] = r21
                goto L2b
            L80:
                java.lang.String r7 = r5.toString()
                r0 = r22
                r3.set(r0, r7)
                java.lang.String r4 = "mPaths"
                r0 = r22
                p201g.expandableListView.MultiDex.access$getExpandFieldArray(r0, r4, r9)
                java.lang.String r4 = "mFiles"
                r0 = r22
                p201g.expandableListView.MultiDex.access$getExpandFieldArray(r0, r4, r10)
                java.lang.String r4 = "mZips"
                r0 = r22
                p201g.expandableListView.MultiDex.access$getExpandFieldArray(r0, r4, r11)
                java.lang.String r4 = "mDexs"
                r0 = r22
                p201g.expandableListView.MultiDex.access$getExpandFieldArray(r0, r4, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p201g.expandableListView.MultiDex.C7536V4.install(java.lang.ClassLoader, java.util.List):void");
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
    static {
        HashSet $r0 = new HashSet();
        installedApk = $r0;
        String $r1 = System.getProperty("java.vm.version");
        boolean $z0 = isVMMultidexCapable($r1);
        IS_VM_MULTIDEX_CAPABLE = $z0;
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
    private static void clearOldDexDir(Context context) throws Exception {
        File $r1 = new File(context.getFilesDir(), "secondary-dexes");
        boolean $z0 = $r1.isDirectory();
        if ($z0) {
            StringBuilder $r3 = new StringBuilder();
            $r3.append("Clearing old secondary dex dir (");
            String $r4 = $r1.getPath();
            $r3.append($r4);
            $r3.append(").");
            String $r42 = $r3.toString();
            Log.i("MultiDex", $r42);
            File[] $r5 = $r1.listFiles();
            if ($r5 == null) {
                StringBuilder $r32 = new StringBuilder();
                $r32.append("Failed to list secondary dex dir content (");
                String $r43 = $r1.getPath();
                $r32.append($r43);
                $r32.append(").");
                String $r44 = $r32.toString();
                Log.w("MultiDex", $r44);
                return;
            }
            for (File $r2 : $r5) {
                StringBuilder $r33 = new StringBuilder();
                $r33.append("Trying to delete old file ");
                String $r45 = $r2.getPath();
                $r33.append($r45);
                $r33.append(" of size ");
                long $l2 = $r2.length();
                $r33.append($l2);
                String $r46 = $r33.toString();
                Log.i("MultiDex", $r46);
                boolean $z02 = $r2.delete();
                if ($z02) {
                    StringBuilder $r34 = new StringBuilder();
                    $r34.append("Deleted old file ");
                    String $r47 = $r2.getPath();
                    $r34.append($r47);
                    String $r48 = $r34.toString();
                    Log.i("MultiDex", $r48);
                } else {
                    StringBuilder $r35 = new StringBuilder();
                    $r35.append("Failed to delete old file ");
                    String $r49 = $r2.getPath();
                    $r35.append($r49);
                    String $r410 = $r35.toString();
                    Log.w("MultiDex", $r410);
                }
            }
            boolean $z03 = $r1.delete();
            if ($z03) {
                StringBuilder $r36 = new StringBuilder();
                $r36.append("Deleted old secondary dex dir ");
                String $r411 = $r1.getPath();
                $r36.append($r411);
                String $r412 = $r36.toString();
                Log.i("MultiDex", $r412);
                return;
            }
            StringBuilder $r37 = new StringBuilder();
            $r37.append("Failed to delete secondary dex dir ");
            String $r413 = $r1.getPath();
            $r37.append($r413);
            String $r414 = $r37.toString();
            Log.w("MultiDex", $r414);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static void expandFieldArray(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field $r3 = findField(obj, str);
        Object $r4 = $r3.get(obj);
        Object[] $r5 = (Object[]) $r4;
        Class $r6 = $r5.getClass();
        Class $r62 = $r6.getComponentType();
        int $i0 = $r5.length;
        int $i1 = objArr.length;
        Object $r42 = Array.newInstance($r62, $i0 + $i1);
        Object[] $r7 = (Object[]) $r42;
        int $i02 = $r5.length;
        System.arraycopy($r5, 0, $r7, 0, $i02);
        int $i03 = $r5.length;
        int $i12 = objArr.length;
        System.arraycopy(objArr, 0, $r7, $i03, $i12);
        $r3.set(obj, $r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static Field findField(Object obj, String str) throws NoSuchFieldException {
        for (Class $r3 = obj.getClass(); $r3 != null; $r3 = $r3.getSuperclass()) {
            try {
                Field $r4 = $r3.getDeclaredField(str);
                boolean $z0 = $r4.isAccessible();
                if ($z0) {
                    return $r4;
                }
                $r4.setAccessible(true);
                return $r4;
            } catch (NoSuchFieldException e) {
            }
        }
        StringBuilder $r5 = new StringBuilder();
        $r5.append("Field ");
        $r5.append(str);
        $r5.append(" not found in ");
        Class $r32 = obj.getClass();
        $r5.append($r32);
        String $r2 = $r5.toString();
        NoSuchFieldException $r0 = new NoSuchFieldException($r2);
        throw $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static Method findMethod(Object obj, String str, Class... clsArr) throws NoSuchMethodException {
        for (Class $r4 = obj.getClass(); $r4 != null; $r4 = $r4.getSuperclass()) {
            try {
                Method $r5 = $r4.getDeclaredMethod(str, clsArr);
                boolean $z0 = $r5.isAccessible();
                if ($z0) {
                    return $r5;
                }
                $r5.setAccessible(true);
                return $r5;
            } catch (NoSuchMethodException e) {
            }
        }
        StringBuilder $r6 = new StringBuilder();
        $r6.append("Method ");
        $r6.append(str);
        $r6.append(" with parameters ");
        List $r7 = Arrays.asList(clsArr);
        $r6.append($r7);
        $r6.append(" not found in ");
        Class $r42 = obj.getClass();
        $r6.append($r42);
        String $r3 = $r6.toString();
        NoSuchMethodException $r1 = new NoSuchMethodException($r3);
        throw $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static ApplicationInfo getApplicationInfo(Context context) {
        try {
            ApplicationInfo $r0 = context.getApplicationInfo();
            return $r0;
        } catch (RuntimeException $r2) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", $r2);
            return null;
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
    public static void install(Context context) {
        Log.i("MultiDex", "Installing application");
        boolean $z0 = IS_VM_MULTIDEX_CAPABLE;
        if ($z0) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 < 4) {
            StringBuilder $r7 = new StringBuilder();
            $r7.append("MultiDex installation failed. SDK ");
            int $i02 = Build.VERSION.SDK_INT;
            $r7.append($i02);
            $r7.append(" is unsupported. Min SDK version is ");
            $r7.append(4);
            $r7.append(".");
            String $r3 = $r7.toString();
            RuntimeException $r6 = new RuntimeException($r3);
            throw $r6;
        }
        try {
            ApplicationInfo $r1 = getApplicationInfo(context);
            if ($r1 == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                return;
            }
            String $r32 = $r1.sourceDir;
            File $r2 = new File($r32);
            String $r33 = $r1.dataDir;
            File $r4 = new File($r33);
            install(context, $r2, $r4, "secondary-dexes", "", true);
            Log.i("MultiDex", "install done");
        } catch (Exception $r5) {
            Log.e("MultiDex", "MultiDex installation failure", $r5);
            StringBuilder $r72 = new StringBuilder();
            $r72.append("MultiDex installation failed (");
            String $r34 = $r5.getMessage();
            $r72.append($r34);
            $r72.append(").");
            String $r35 = $r72.toString();
            RuntimeException $r62 = new RuntimeException($r35);
            throw $r62;
        }
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
    private static void install(Context context, File file, File file2, String str, String str2, boolean z) throws IOException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
        Set $r1 = installedApk;
        synchronized ($r1) {
            Set $r7 = installedApk;
            boolean $z1 = $r7.contains(file);
            if ($z1) {
                return;
            }
            Set $r72 = installedApk;
            $r72.add(file);
            int $i0 = Build.VERSION.SDK_INT;
            if ($i0 > 20) {
                StringBuilder $r8 = new StringBuilder();
                $r8.append("MultiDex is not guaranteed to work in SDK version ");
                int $i02 = Build.VERSION.SDK_INT;
                $r8.append($i02);
                $r8.append(": SDK version higher than ");
                $r8.append(20);
                $r8.append(" should be backed by ");
                $r8.append("runtime with built-in multidex capabilty but it's not the ");
                $r8.append("case here: java.vm.version=\"");
                String $r9 = System.getProperty("java.vm.version");
                $r8.append($r9);
                $r8.append("\"");
                String $r92 = $r8.toString();
                Log.w("MultiDex", $r92);
            }
            ClassLoader $r10 = load(context);
            if ($r10 == null) {
                return;
            }
            clearOldDexDir(context);
            File $r5 = load(context, file2, str);
            Cache $r12 = new Cache(file, $r5);
            IOException $r13 = null;
            List $r14 = $r12.load(context, str2, false);
            try {
                installSecondaryDexes($r10, $r5, $r14);
            } catch (IOException $r15) {
                if (!z) {
                    throw $r15;
                }
                Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", $r15);
                List $r142 = $r12.load(context, str2, true);
                installSecondaryDexes($r10, $r5, $r142);
            }
            try {
                $r12.close();
            } catch (IOException e) {
                $r13 = e;
            }
            if ($r13 != null) {
                throw $r13;
            }
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
    private static void installSecondaryDexes(ClassLoader classLoader, File file, List list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        boolean $z0 = list.isEmpty();
        if ($z0) {
            return;
        }
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 19) {
            V19.install(classLoader, list, file);
        } else if ($i0 >= 14) {
            EclipseLocation.install(classLoader, list);
        } else {
            C7536V4.install(classLoader, list);
        }
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
    static boolean isVMMultidexCapable(String str) {
        boolean $z0 = false;
        if (str != null) {
            StringTokenizer $r2 = new StringTokenizer(str, ".");
            boolean $z1 = $r2.hasMoreTokens();
            String $r4 = $z1 ? $r2.nextToken() : null;
            boolean $z12 = $r2.hasMoreTokens();
            String $r3 = $z12 ? $r2.nextToken() : null;
            if ($r4 != null && $r3 != null) {
                try {
                    int $i0 = Integer.parseInt($r4);
                    int $i1 = Integer.parseInt($r3);
                    if ($i0 > 2 || ($i0 == 2 && $i1 >= 1)) {
                        $z0 = true;
                    }
                } catch (NumberFormatException e) {
                }
            }
        }
        StringBuilder $r5 = new StringBuilder();
        $r5.append("VM with version ");
        $r5.append(str);
        String $r1 = $z0 ? " has multidex support" : " does not have multidex support";
        $r5.append($r1);
        String $r12 = $r5.toString();
        Log.i("MultiDex", $r12);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static File load(Context context, File file, String str) throws IOException {
        File $r4 = new File(file, "code_cache");
        try {
            mkdirChecked($r4);
        } catch (IOException e) {
            $r4 = new File(context.getFilesDir(), "code_cache");
            mkdirChecked($r4);
        }
        File $r0 = new File($r4, str);
        mkdirChecked($r0);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static ClassLoader load(Context context) {
        try {
            ClassLoader $r0 = context.getClassLoader();
            int $i0 = Build.VERSION.SDK_INT;
            if ($i0 >= 14) {
                boolean $z0 = $r0 instanceof BaseDexClassLoader;
                if ($z0) {
                    return $r0;
                }
            } else {
                boolean $z02 = $r0 instanceof DexClassLoader;
                if ($z02) {
                    return $r0;
                }
                boolean $z03 = $r0 instanceof PathClassLoader;
                if ($z03) {
                    return $r0;
                }
            }
            Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
            return null;
        } catch (RuntimeException $r2) {
            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", $r2);
            return null;
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
    private static void mkdirChecked(File file) throws IOException {
        file.mkdir();
        boolean $z0 = file.isDirectory();
        if ($z0) {
            return;
        }
        File $r2 = file.getParentFile();
        if ($r2 == null) {
            StringBuilder $r0 = new StringBuilder();
            $r0.append("Failed to create dir ");
            String $r3 = file.getPath();
            $r0.append($r3);
            $r0.append(". Parent file is null.");
            String $r32 = $r0.toString();
            Log.e("MultiDex", $r32);
        } else {
            StringBuilder $r02 = new StringBuilder();
            $r02.append("Failed to create dir ");
            String $r33 = file.getPath();
            $r02.append($r33);
            $r02.append(". parent file is a dir ");
            boolean $z02 = $r2.isDirectory();
            $r02.append($z02);
            $r02.append(", a file ");
            boolean $z03 = $r2.isFile();
            $r02.append($z03);
            $r02.append(", exists ");
            boolean $z04 = $r2.exists();
            $r02.append($z04);
            $r02.append(", readable ");
            boolean $z05 = $r2.canRead();
            $r02.append($z05);
            $r02.append(", writable ");
            boolean $z06 = $r2.canWrite();
            $r02.append($z06);
            String $r34 = $r02.toString();
            Log.e("MultiDex", $r34);
        }
        StringBuilder $r03 = new StringBuilder();
        $r03.append("Failed to create directory ");
        String $r35 = file.getPath();
        $r03.append($r35);
        String $r36 = $r03.toString();
        IOException $r4 = new IOException($r36);
        throw $r4;
    }
}
