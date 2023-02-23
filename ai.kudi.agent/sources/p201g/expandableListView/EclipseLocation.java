package p201g.expandableListView;

import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.zip.ZipFile;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MultiDex.java */
/* renamed from: g.expandableListView.EclipseLocation */
/* loaded from: classes.dex */
public final class EclipseLocation {
    private static final int name = 4;
    private final a$a$a JAVA_AGENT_LINE_MATCHER;

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
    private EclipseLocation() throws ClassNotFoundException, SecurityException, NoSuchMethodException {
        a$a$a a_a_a;
        a$a$a a_a_a2;
        final Class $r1 = Class.forName("dalvik.system.DexPathList$Element");
        a$a$a $r4 = a_a_a;
        try {
            a_a_a = new a$a$a($r1) { // from class: g.expandableListView.a$a$b

                /* renamed from: c */
                private final Constructor<?> f17917c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
                 */
                {
                    Class[] $r3 = {File.class, ZipFile.class, DexFile.class};
                    Constructor $r12 = $r1.getConstructor($r3);
                    this.f17917c = $r12;
                    $r12.setAccessible(true);
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
                 */
                @Override // p201g.expandableListView.a$a$a
                public Object get(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                    Constructor $r2 = this.f17917c;
                    ZipFile $r6 = new ZipFile(file);
                    Object[] $r5 = {file, $r6, dexFile};
                    Object $r3 = $r2.newInstance($r5);
                    return $r3;
                }
            };
        } catch (NoSuchMethodException e) {
            $r4 = a_a_a2;
            try {
                a_a_a2 = new a$a$a($r1) { // from class: g.expandableListView.a$a$c

                    /* renamed from: c */
                    private final Constructor<?> f17918c;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
                     */
                    {
                        Class[] $r3 = {File.class, File.class, DexFile.class};
                        Constructor $r12 = $r1.getConstructor($r3);
                        this.f17918c = $r12;
                        $r12.setAccessible(true);
                    }

                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
                     */
                    @Override // p201g.expandableListView.a$a$a
                    public Object get(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                        Constructor $r2 = this.f17918c;
                        Object[] $r5 = {file, file, dexFile};
                        Object $r3 = $r2.newInstance($r5);
                        return $r3;
                    }
                };
            } catch (NoSuchMethodException e2) {
                $r4 = r5;
                a$a$a a_a_a3 = new a$a$a($r1) { // from class: g.expandableListView.a$a$d

                    /* renamed from: c */
                    private final Constructor<?> f17919c;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
                     */
                    {
                        Class $r12 = Boolean.TYPE;
                        Class[] $r42 = {File.class, $r12, File.class, DexFile.class};
                        Constructor $r2 = $r1.getConstructor($r42);
                        this.f17919c = $r2;
                        $r2.setAccessible(true);
                    }

                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
                     */
                    @Override // p201g.expandableListView.a$a$a
                    public Object get(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                        Constructor $r2 = this.f17919c;
                        Boolean $r6 = Boolean.FALSE;
                        Object[] $r5 = {file, $r6, file, dexFile};
                        Object $r3 = $r2.newInstance($r5);
                        return $r3;
                    }
                };
            }
        }
        this.JAVA_AGENT_LINE_MATCHER = $r4;
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
    public static void install(ClassLoader classLoader, List list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        Field $r2 = MultiDex.findField(classLoader, "pathList");
        Object $r3 = $r2.get(classLoader);
        EclipseLocation $r4 = new EclipseLocation();
        Object[] $r5 = $r4.install(list);
        try {
            MultiDex.expandFieldArray($r3, "dexElements", $r5);
        } catch (NoSuchFieldException $r6) {
            Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", $r6);
            MultiDex.expandFieldArray($r3, "pathElements", $r5);
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
    private Object[] install(List list) throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        int $i0 = list.size();
        Object[] $r2 = new Object[$i0];
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            Object $r4 = list.get($i1);
            File $r5 = (File) $r4;
            a$a$a $r3 = this.JAVA_AGENT_LINE_MATCHER;
            String $r6 = $r5.getPath();
            String $r7 = read($r5);
            DexFile $r8 = DexFile.loadDex($r6, $r7, 0);
            Object $r42 = $r3.get($r5, $r8);
            $r2[$i1] = $r42;
        }
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static String read(File file) {
        File $r1 = file.getParentFile();
        String $r2 = file.getName();
        StringBuilder $r3 = new StringBuilder();
        int $i0 = $r2.length();
        int $i1 = name;
        $r3.append($r2.substring(0, $i0 - $i1));
        $r3.append(".dex");
        File $r0 = new File($r1, $r3.toString());
        return $r0.getPath();
    }
}
