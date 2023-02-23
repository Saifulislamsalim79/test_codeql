package org.org.org.org.asm;

import android.graphics.Bitmap;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p492io.C11857j;
import kotlin.p492io.C11859l;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13712m;
import org.org.org.org.asm.menu.C14608i;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
/* loaded from: classes.dex */
public final class ByteVector {

    /* renamed from: a */
    public static final ByteVector f32302a;

    /* renamed from: b */
    public static final String f32303b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ByteVector $r0 = new ByteVector();
        f32302a = $r0;
        String $r1 = File.separator;
        Log_OC.loadImage($r1, "File.separator");
        f32303b = $r1;
    }

    private ByteVector() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final String m1165a(File file) {
        Log_OC.getArray(file, "fileToRead");
        System $r1 = System.f32375c;
        LogAspect $r2 = LogAspect.STORAGE;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r1.get($r2, true, $r3);
        int $i0 = $r4.ordinal();
        String $r5 = null;
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("readFileContent() called with: fileToRead = ");
            String $r8 = Log.get(file, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r2);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r1.size($r2, $r3, "FileUtil", $r83);
        }
        try {
            boolean $z0 = file.exists();
            if ($z0) {
                $r5 = C11857j.m10238c(file, null, 1, null);
            }
        } catch (Exception $r9) {
            System $r12 = System.f32375c;
            LogAspect $r22 = LogAspect.STORAGE;
            LogSeverity $r32 = LogSeverity.WARN;
            TopLevel$NativeErrors $r42 = $r12.get($r22, true, $r32);
            int $i02 = $r42.ordinal();
            if ($i02 == 0) {
                StringBuilder $r62 = new StringBuilder();
                StringBuilder $r72 = new StringBuilder();
                $r72.append("readFileContent() failed: exception = ");
                String $r84 = Log.get($r9, false, 2, null);
                $r72.append($r84);
                String $r85 = $r72.toString();
                $r62.append($r85);
                $r62.append(", [logAspect: ");
                $r62.append($r22);
                $r62.append(']');
                String $r86 = $r62.toString();
                $r12.size($r22, $r32, "FileUtil", $r86);
            }
        }
        System $r13 = System.f32375c;
        LogAspect $r23 = LogAspect.STORAGE;
        LogSeverity $r33 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r43 = $r13.get($r23, true, $r33);
        int $i03 = $r43.ordinal();
        if ($i03 != 0) {
            return $r5;
        }
        StringBuilder $r63 = new StringBuilder();
        StringBuilder $r73 = new StringBuilder();
        $r73.append("readFileContent(): content = \n");
        String $r87 = $r5 != null ? $r5 : "null";
        $r73.append($r87);
        String $r88 = $r73.toString();
        $r63.append($r88);
        $r63.append(", [logAspect: ");
        $r63.append($r23);
        $r63.append(']');
        String $r89 = $r63.toString();
        $r13.size($r23, $r33, "FileUtil", $r89);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final String m1160a(boolean z, String str) {
        String $r2;
        if (z) {
            return str;
        }
        StringBuilder $r3 = new StringBuilder();
        String $r1 = f32303b;
        $r2 = C13277t.m5416L0(str, $r1, null, 2, null);
        $r3.append($r2);
        $r3.append($r1);
        String $r22 = $r3.toString();
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ List get(ByteVector byteVector, File file, boolean $z0, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $z0 = false;
        }
        List $r2 = byteVector.get(file, $z0);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String[] get(List list) {
        ArrayList $r3 = new ArrayList();
        Iterator $r4 = list.iterator();
        while (true) {
            boolean $z0 = $r4.hasNext();
            if (!$z0) {
                break;
            }
            Object $r1 = $r4.next();
            boolean $z02 = $r1 instanceof String;
            if ($z02) {
                $r3.add($r1);
            } else {
                boolean $z03 = $r1 instanceof Integer;
                if ($z03) {
                    String $r5 = $r1.toString();
                    $r3.add($r5);
                } else {
                    boolean $z04 = $r1 instanceof Object[];
                    if ($z04) {
                        Object[] $r6 = (Object[]) $r1;
                        for (Object $r12 : $r6) {
                            boolean $z05 = $r12 instanceof String;
                            if ($z05) {
                                $r3.add($r12);
                            }
                        }
                    }
                }
            }
        }
        String[] $r7 = new String[0];
        Object[] $r62 = $r3.toArray($r7);
        if ($r62 != null) {
            String[] $r72 = (String[]) $r62;
            return $r72;
        }
        NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void write(String str, File file) {
        Log_OC.getArray(str, "content");
        Log_OC.getArray(file, "file");
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.STORAGE;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, true, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("writeContentToFile() writing: file = ");
            String $r8 = Log.get(file, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r2.size($r3, $r4, "FileUtil", $r83);
        }
        LogSeverity $r42 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r52 = $r2.get($r3, true, $r42);
        int $i02 = $r52.ordinal();
        if ($i02 == 0) {
            StringBuilder $r62 = new StringBuilder();
            String $r84 = "writeContentToFile(): content = \n" + str;
            $r62.append($r84);
            $r62.append(", [logAspect: ");
            $r62.append($r3);
            $r62.append(']');
            String $r85 = $r62.toString();
            $r2.size($r3, $r42, "FileUtil", $r85);
        }
        try {
            file.createNewFile();
            C11857j.m10235f(file, str, null, 2, null);
        } catch (IOException $r9) {
            System $r22 = System.f32375c;
            LogAspect $r32 = LogAspect.STORAGE;
            LogSeverity $r43 = LogSeverity.WARN;
            TopLevel$NativeErrors $r53 = $r22.get($r32, true, $r43);
            int $i03 = $r53.ordinal();
            if ($i03 != 0) {
                return;
            }
            StringBuilder $r63 = new StringBuilder();
            StringBuilder $r72 = new StringBuilder();
            $r72.append("writeContentToFile() write failed: ");
            $r72.append("file = ");
            String $r0 = Log.get(file, false, 2, null);
            $r72.append($r0);
            $r72.append(", ");
            $r72.append("exception = ");
            String $r02 = Log.get($r9, false, 2, null);
            $r72.append($r02);
            String $r03 = $r72.toString();
            $r63.append($r03);
            $r63.append(", [logAspect: ");
            $r63.append($r32);
            $r63.append(']');
            String $r04 = $r63.toString();
            $r22.size($r32, $r43, "FileUtil", $r04);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void write(boolean z, String str) {
        try {
            String $r6 = m1160a(z, str);
            File $r5 = new File($r6);
            boolean $z1 = $r5.exists();
            if ($z1) {
                return;
            }
            $r5.mkdirs();
        } catch (Exception $r7) {
            System $r8 = System.f32375c;
            LogAspect $r1 = LogAspect.STORAGE;
            LogSeverity $r2 = LogSeverity.WARN;
            TopLevel$NativeErrors $r9 = $r8.get($r1, true, $r2);
            int $i0 = $r9.ordinal();
            if ($i0 != 0) {
                return;
            }
            StringBuilder $r10 = new StringBuilder();
            StringBuilder $r3 = new StringBuilder();
            $r3.append("mkdirs() failed: ");
            $r3.append("isFolder = ");
            $r3.append(z);
            $r3.append(", ");
            $r3.append("path = ");
            $r3.append(str);
            $r3.append(", ");
            $r3.append("exception = ");
            String $r4 = Log.get($r7, false, 2, null);
            $r3.append($r4);
            String $r42 = $r3.toString();
            $r10.append($r42);
            $r10.append(", [logAspect: ");
            $r10.append($r1);
            $r10.append(']');
            String $r43 = $r10.toString();
            $r8.size($r1, $r2, "FileUtil", $r43);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final File m1161a(String str, boolean z, boolean z2, Object... objArr) {
        List $r3;
        Log_OC.getArray(str, "root");
        Log_OC.getArray(objArr, "pathParts");
        $r3 = C13712m.m4067d(objArr);
        String $r1 = m1162a(str, z, $r3);
        if (z2) {
            ByteVector $r0 = f32302a;
            $r0.write(z, $r1);
        }
        File $r4 = new File($r1);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final String m1162a(String str, boolean z, List list) {
        Log_OC.getArray(str, "root");
        Log_OC.getArray(list, "pathParts");
        StringBuilder $r4 = new StringBuilder();
        $r4.append(str);
        ByteVector $r0 = f32302a;
        String[] $r5 = $r0.get(list);
        for (String $r1 : $r5) {
            String $r2 = f32303b;
            $r4.append($r2);
            $r4.append($r1);
        }
        if (z) {
            $r4.append(f32303b);
        }
        String $r12 = $r4.toString();
        Log_OC.loadImage($r12, "StringBuilder().append(r…   }\n        }.toString()");
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m1164a(File file, String str) {
        Log_OC.getArray(file, "folder");
        Log_OC.getArray(str, "suffix");
        ClassReader $r4 = new ClassReader(str);
        File[] $r2 = file.listFiles($r4);
        read($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m1163a(Object obj, File file) {
        Log_OC.getArray(obj, "serializableObject");
        Log_OC.getArray(file, "file");
        C14608i $r3 = C14608i.f32364b;
        String $r4 = $r3.get(obj);
        write($r4.toString(), file);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean add(java.io.File r17) {
        /*
            r16 = this;
            java.lang.String r1 = "folder"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r17
            boolean r2 = r0.exists()     // Catch: java.lang.Exception -> L85
            if (r2 == 0) goto L27
            r0 = r17
            java.io.File[] r3 = r0.listFiles()     // Catch: java.lang.Exception -> L85
            if (r3 == 0) goto L22
            int r4 = r3.length
            if (r4 != 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L20
            goto L22
        L20:
            r2 = 0
            goto L23
        L22:
            r2 = 1
        L23:
            if (r2 != 0) goto L27
            r2 = 1
            goto L28
        L27:
            r2 = 0
        L28:
            org.org.org.org.asm.parser.System r5 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r6 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.STORAGE
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r7 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.DEBUG
            r9 = 1
            org.org.org.org.asm.parser.TopLevel$NativeErrors r8 = r5.get(r6, r9, r7)     // Catch: java.lang.Exception -> L85
            int r4 = r8.ordinal()     // Catch: java.lang.Exception -> L85
            if (r4 == 0) goto L3a
            goto L84
        L3a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()     // Catch: java.lang.Exception -> L85
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = "isFolderWorthHandling() check if folder is worth handling: "
            r11.append(r1)     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = "folder = "
            r11.append(r1)     // Catch: java.lang.Exception -> L85
            r9 = 0
            r13 = 2
            r14 = 0
            r0 = r17
            java.lang.String r12 = org.org.org.org.asm.parser.Log.get(r0, r9, r13, r14)     // Catch: java.lang.Exception -> L85
            r11.append(r12)     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = ", "
            r11.append(r1)     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = "worthHandling = "
            r11.append(r1)     // Catch: java.lang.Exception -> L85
            r11.append(r2)     // Catch: java.lang.Exception -> L85
            java.lang.String r12 = r11.toString()     // Catch: java.lang.Exception -> L85
            r10.append(r12)     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = ", [logAspect: "
            r10.append(r1)     // Catch: java.lang.Exception -> L85
            r10.append(r6)     // Catch: java.lang.Exception -> L85
            r9 = 93
            r10.append(r9)     // Catch: java.lang.Exception -> L85
            java.lang.String r12 = r10.toString()     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = "FileUtil"
            r5.size(r6, r7, r1, r12)     // Catch: java.lang.Exception -> L85
        L84:
            return r2
        L85:
            r15 = move-exception
            org.org.org.org.asm.parser.System r5 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r6 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.STORAGE
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r7 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.WARN
            r9 = 1
            org.org.org.org.asm.parser.TopLevel$NativeErrors r8 = r5.get(r6, r9, r7)
            int r4 = r8.ordinal()
            if (r4 == 0) goto L99
            r9 = 0
            return r9
        L99:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "isFolderWorthHandling() failed: exception = "
            r10.append(r1)
            r9 = 0
            r13 = 2
            r14 = 0
            java.lang.String r12 = org.org.org.org.asm.parser.Log.get(r15, r9, r13, r14)
            r10.append(r12)
            java.lang.String r12 = r10.toString()
            r11.append(r12)
            java.lang.String r1 = ", [logAspect: "
            r11.append(r1)
            r11.append(r6)
            r9 = 93
            r11.append(r9)
            java.lang.String r12 = r11.toString()
            java.lang.String r1 = "FileUtil"
            r5.size(r6, r7, r1, r12)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.ByteVector.add(java.io.File):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List get(java.io.File r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "folder"
            kotlin.p483e0.p485d.Log_OC.getArray(r10, r0)
            java.util.List r1 = r9.load(r10, r11)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r3 = kotlin.p557z.C13722p.m3921o(r1, r4)
            r2.<init>(r3)
            java.util.Iterator r5 = r1.iterator()
        L18:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L2e
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.io.File r7 = (java.io.File) r7
            r10 = r7
            java.lang.String r8 = r10.getName()
            r2.add(r8)
            goto L18
        L2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.ByteVector.get(java.io.File, boolean):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void get(File file) {
        Log_OC.getArray(file, "file");
        try {
            boolean $z0 = file.exists();
            if ($z0) {
                C11859l.m10231j(file);
            }
        } catch (Exception $r6) {
            System $r1 = System.f32375c;
            LogAspect $r2 = LogAspect.STORAGE;
            LogSeverity $r3 = LogSeverity.DEBUG;
            TopLevel$NativeErrors $r7 = $r1.get($r2, true, $r3);
            int $i0 = $r7.ordinal();
            if ($i0 != 0) {
                return;
            }
            StringBuilder $r8 = new StringBuilder();
            StringBuilder $r4 = new StringBuilder();
            $r4.append("deleteFileOrFolder() failed: ");
            $r4.append("file = ");
            String $r9 = Log.get(file, false, 2, null);
            $r4.append($r9);
            $r4.append(", ");
            $r4.append("exception = ");
            String $r92 = Log.get($r6, false, 2, null);
            $r4.append($r92);
            String $r93 = $r4.toString();
            $r8.append($r93);
            $r8.append(", [logAspect: ");
            $r8.append($r2);
            $r8.append(']');
            String $r94 = $r8.toString();
            $r1.size($r2, $r3, "FileUtil", $r94);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:34:0x0022 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List load(java.io.File r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = "folder"
            kotlin.p483e0.p485d.Log_OC.getArray(r9, r0)
            boolean r1 = r9.exists()
            if (r1 == 0) goto L44
            java.io.File[] r2 = r9.listFiles()
            if (r2 == 0) goto L44
            java.util.List r3 = kotlin.p557z.C13706j.m4097Z(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r3.iterator()
        L1e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.io.File r7 = (java.io.File) r7
            r9 = r7
            if (r10 == 0) goto L3c
            java.lang.String r0 = "fileOrFolder"
            kotlin.p483e0.p485d.Log_OC.loadImage(r9, r0)
            boolean r1 = r9.isDirectory()
            if (r1 == 0) goto L3a
            goto L3c
        L3a:
            r1 = 0
            goto L3d
        L3c:
            r1 = 1
        L3d:
            if (r1 == 0) goto L1e
            r4.add(r6)
            goto L1e
        L43:
            return r4
        L44:
            java.util.List r3 = kotlin.p557z.C13722p.m3941e()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.ByteVector.load(java.io.File, boolean):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void put(Bitmap bitmap, int i, File file) throws IOException {
        Log_OC.getArray(bitmap, "bitmap");
        Log_OC.getArray(file, "file");
        FileOutputStream $r3 = new FileOutputStream(file);
        Bitmap.CompressFormat $r4 = Bitmap.CompressFormat.JPEG;
        bitmap.compress($r4, i, $r3);
        $r3.flush();
        $r3.close();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void read(File[] fileArr) {
        if (fileArr != null) {
            for (File $r4 : fileArr) {
                try {
                    get($r4);
                } catch (Exception $r5) {
                    System $r6 = System.f32375c;
                    LogAspect $r7 = LogAspect.STORAGE;
                    LogSeverity $r1 = LogSeverity.DEBUG;
                    TopLevel$NativeErrors $r8 = $r6.get($r7, true, $r1);
                    int $i0 = $r8.ordinal();
                    if ($i0 != 0) {
                        return;
                    }
                    StringBuilder $r9 = new StringBuilder();
                    StringBuilder $r2 = new StringBuilder();
                    $r2.append("deleteFilesOrFolders() failed: ");
                    $r2.append("filesOrFoldersToDelete = ");
                    String $r10 = Log.toString((Object[]) fileArr, false, false, 6, (Object) null);
                    $r2.append($r10);
                    $r2.append("exception = ");
                    String $r102 = Log.get($r5, false, 2, null);
                    $r2.append($r102);
                    String $r103 = $r2.toString();
                    $r9.append($r103);
                    $r9.append(", [logAspect: ");
                    $r9.append($r7);
                    $r9.append(']');
                    String $r104 = $r9.toString();
                    $r6.size($r7, $r1, "FileUtil", $r104);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean write(File file) {
        Log_OC.getArray(file, "file");
        try {
            boolean $z0 = file.exists();
            System $r3 = System.f32375c;
            LogAspect $r4 = LogAspect.STORAGE;
            LogSeverity $r5 = LogSeverity.VERBOSE;
            TopLevel$NativeErrors $r6 = $r3.get($r4, true, $r5);
            int $i0 = $r6.ordinal();
            if ($i0 == 0) {
                StringBuilder $r7 = new StringBuilder();
                StringBuilder $r1 = new StringBuilder();
                $r1.append("isFileCreated() check if file exists: ");
                $r1.append("file = ");
                String $r8 = Log.get(file, false, 2, null);
                $r1.append($r8);
                $r1.append(", ");
                $r1.append("exists = ");
                $r1.append($z0);
                String $r82 = $r1.toString();
                $r7.append($r82);
                $r7.append(", [logAspect: ");
                $r7.append($r4);
                $r7.append(']');
                String $r83 = $r7.toString();
                $r3.size($r4, $r5, "FileUtil", $r83);
            }
            return $z0;
        } catch (Exception $r9) {
            System $r32 = System.f32375c;
            LogAspect $r42 = LogAspect.STORAGE;
            LogSeverity $r52 = LogSeverity.WARN;
            TopLevel$NativeErrors $r62 = $r32.get($r42, true, $r52);
            int $i02 = $r62.ordinal();
            if ($i02 != 0) {
                return false;
            }
            StringBuilder $r12 = new StringBuilder();
            StringBuilder $r72 = new StringBuilder();
            $r72.append("isFileCreated() failed: exception = ");
            String $r84 = Log.get($r9, false, 2, null);
            $r72.append($r84);
            String $r85 = $r72.toString();
            $r12.append($r85);
            $r12.append(", [logAspect: ");
            $r12.append($r42);
            $r12.append(']');
            String $r86 = $r12.toString();
            $r32.size($r42, $r52, "FileUtil", $r86);
            return false;
        }
    }
}
