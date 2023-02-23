package p201g.expandableListView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
/* compiled from: MultiDexExtractor.java */
/* renamed from: g.expandableListView.Cache */
/* loaded from: classes.dex */
final class Cache implements Closeable {
    private final FileChannel channel;
    private final File file;

    /* renamed from: id */
    private final long f17915id;

    /* renamed from: in */
    private final RandomAccessFile f17916in;
    private final File length;
    private final FileLock source;

    /* JADX INFO: Access modifiers changed from: package-private */
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
    public Cache(File file, File file2) throws IOException {
        StringBuilder r10 = new StringBuilder();
        r10.append("MultiDexExtractor(");
        String $r4 = file.getPath();
        r10.append($r4);
        r10.append(", ");
        String $r42 = file2.getPath();
        r10.append($r42);
        r10.append(")");
        String $r43 = r10.toString();
        Log.i("MultiDex", $r43);
        this.file = file;
        this.length = file2;
        long $l0 = toString(file);
        this.f17915id = $l0;
        File r11 = new File(file2, "MultiDex.lock");
        RandomAccessFile r12 = new RandomAccessFile(r11, "rw");
        this.f17916in = r12;
        try {
            try {
                try {
                    FileChannel $r6 = r12.getChannel();
                    this.channel = $r6;
                    try {
                        try {
                            try {
                                StringBuilder r102 = new StringBuilder();
                                r102.append("Blocking on lock ");
                                String $r44 = r11.getPath();
                                r102.append($r44);
                                String $r45 = r102.toString();
                                Log.i("MultiDex", $r45);
                                FileChannel $r62 = this.channel;
                                FileLock $r7 = $r62.lock();
                                this.source = $r7;
                                StringBuilder r103 = new StringBuilder();
                                String $r46 = r11.getPath();
                                r103.append($r46);
                                r103.append(" locked");
                                String $r47 = r103.toString();
                                Log.i("MultiDex", $r47);
                            } catch (RuntimeException e) {
                                $r8 = e;
                                FileChannel $r63 = this.channel;
                                closeQuietly($r63);
                                throw $r8;
                            }
                        } catch (IOException e2) {
                            $r8 = e2;
                            FileChannel $r632 = this.channel;
                            closeQuietly($r632);
                            throw $r8;
                        }
                    } catch (Error e3) {
                        $r8 = e3;
                    }
                } catch (Error e4) {
                    e = e4;
                    RandomAccessFile $r5 = this.f17916in;
                    closeQuietly($r5);
                    Throwable r13 = e;
                    throw r13;
                }
            } catch (RuntimeException e5) {
                e = e5;
                RandomAccessFile $r52 = this.f17916in;
                closeQuietly($r52);
                Throwable r132 = e;
                throw r132;
            }
        } catch (IOException e6) {
            e = e6;
            RandomAccessFile $r522 = this.f17916in;
            closeQuietly($r522);
            Throwable r1322 = e;
            throw r1322;
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
    private static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException $r1) {
            Log.w("MultiDex", "Failed to close resource", $r1);
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
    private static void extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream $r4 = zipFile.getInputStream(zipEntry);
        String $r3 = "tmp-" + str;
        File $r6 = File.createTempFile($r3, ".zip", file.getParentFile());
        StringBuilder $r5 = new StringBuilder();
        $r5.append("Extracting ");
        String $r32 = $r6.getPath();
        $r5.append($r32);
        String $r33 = $r5.toString();
        Log.i("MultiDex", $r33);
        try {
            FileOutputStream $r9 = new FileOutputStream($r6);
            BufferedOutputStream $r8 = new BufferedOutputStream($r9);
            ZipOutputStream $r7 = new ZipOutputStream($r8);
            ZipEntry $r10 = new ZipEntry("classes.dex");
            long $l0 = zipEntry.getTime();
            $r10.setTime($l0);
            $r7.putNextEntry($r10);
            byte[] $r11 = new byte[16384];
            for (int $i1 = $r4.read($r11); $i1 != -1; $i1 = $r4.read($r11)) {
                $r7.write($r11, 0, $i1);
            }
            $r7.closeEntry();
            $r7.close();
            boolean $z0 = $r6.setReadOnly();
            if (!$z0) {
                StringBuilder $r52 = new StringBuilder();
                $r52.append("Failed to mark readonly \"");
                String $r34 = $r6.getAbsolutePath();
                $r52.append($r34);
                $r52.append("\" (tmp of \"");
                String $r35 = file.getAbsolutePath();
                $r52.append($r35);
                $r52.append("\")");
                String $r36 = $r52.toString();
                IOException $r12 = new IOException($r36);
                throw $r12;
            }
            StringBuilder $r53 = new StringBuilder();
            $r53.append("Renaming to ");
            String $r37 = file.getPath();
            $r53.append($r37);
            String $r38 = $r53.toString();
            Log.i("MultiDex", $r38);
            boolean $z02 = $r6.renameTo(file);
            if ($z02) {
                return;
            }
            StringBuilder $r54 = new StringBuilder();
            $r54.append("Failed to rename \"");
            String $r39 = $r6.getAbsolutePath();
            $r54.append($r39);
            $r54.append("\" to \"");
            String $r310 = file.getAbsolutePath();
            $r54.append($r310);
            $r54.append("\"");
            String $r311 = $r54.toString();
            IOException $r122 = new IOException($r311);
            throw $r122;
        } finally {
            closeQuietly($r4);
            $r6.delete();
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
    private static long get(File file) {
        long $l0 = file.lastModified();
        return $l0 == -1 ? $l0 - 1 : $l0;
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
    private static SharedPreferences get(Context context) {
        int $i0 = Build.VERSION.SDK_INT;
        byte $b1 = $i0 < 11 ? (byte) 0 : (byte) 4;
        SharedPreferences $r0 = context.getSharedPreferences("multidex.version", $b1);
        return $r0;
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
    private List performExtractions() throws IOException {
        StringBuilder $r3 = new StringBuilder();
        File $r4 = this.file;
        $r3.append($r4.getName());
        $r3.append(".classes");
        String $r5 = $r3.toString();
        prepareDexDir();
        ArrayList $r1 = new ArrayList();
        File $r42 = this.file;
        ZipFile $r2 = new ZipFile($r42);
        try {
            String $r6 = "classes2.dex";
            ZipEntry $r7 = $r2.getEntry($r6);
            int $i0 = 2;
            while ($r7 != null) {
                String $r62 = $r5 + $i0 + ".zip";
                File $r43 = this.length;
                Attribute $r8 = new Attribute($r43, $r62);
                $r1.add($r8);
                String $r63 = "Extraction is needed for file " + $r8;
                Log.i("MultiDex", $r63);
                int $i1 = 0;
                boolean $z0 = false;
                while ($i1 < 3 && !$z0) {
                    $i1++;
                    extract($r2, $r7, $r8, $r5);
                    try {
                        long $l2 = toString($r8);
                        $r8.length = $l2;
                        $z0 = true;
                    } catch (IOException $r9) {
                        StringBuilder $r32 = new StringBuilder();
                        $r32.append("Failed to read crc from ");
                        String $r64 = $r8.getAbsolutePath();
                        $r32.append($r64);
                        String $r65 = $r32.toString();
                        Log.w("MultiDex", $r65, $r9);
                        $z0 = false;
                    }
                    StringBuilder $r33 = new StringBuilder();
                    $r33.append("Extraction ");
                    String $r66 = $z0 ? "succeeded" : "failed";
                    $r33.append($r66);
                    $r33.append(" '");
                    String $r67 = $r8.getAbsolutePath();
                    $r33.append($r67);
                    $r33.append("': length ");
                    long $l22 = $r8.length();
                    $r33.append($l22);
                    $r33.append(" - crc: ");
                    long $l23 = $r8.length;
                    $r33.append($l23);
                    String $r68 = $r33.toString();
                    Log.i("MultiDex", $r68);
                    if (!$z0) {
                        $r8.delete();
                        boolean $z1 = $r8.exists();
                        if ($z1) {
                            StringBuilder $r34 = new StringBuilder();
                            $r34.append("Failed to delete corrupted secondary dex '");
                            String $r69 = $r8.getPath();
                            $r34.append($r69);
                            $r34.append("'");
                            String $r610 = $r34.toString();
                            Log.w("MultiDex", $r610);
                        }
                    }
                }
                if (!$z0) {
                    IOException $r92 = new IOException("Could not create zip file " + $r8.getAbsolutePath() + " for secondary dex (" + $i0 + ")");
                    throw $r92;
                }
                $i0++;
                String $r611 = "classes" + $i0 + ".dex";
                $r7 = $r2.getEntry($r611);
            }
            try {
                return $r1;
            } catch (IOException $r10) {
                return $r1;
            }
        } finally {
            try {
                $r2.close();
            } catch (IOException $r102) {
                Log.w("MultiDex", "Failed to close resource", $r102);
            }
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
    private void prepareDexDir() {
        File[] $r3 = this.length.listFiles(new FileFilter(this) { // from class: g.expandableListView.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                String $r2 = file.getName();
                boolean $z0 = $r2.equals("MultiDex.lock");
                return !$z0;
            }
        });
        if ($r3 == null) {
            StringBuilder $r4 = new StringBuilder();
            $r4.append("Failed to list secondary dex dir content (");
            String $r5 = this.length.getPath();
            $r4.append($r5);
            $r4.append(").");
            String $r52 = $r4.toString();
            Log.w("MultiDex", $r52);
            return;
        }
        for (File $r1 : $r3) {
            StringBuilder $r42 = new StringBuilder();
            $r42.append("Trying to delete old file ");
            String $r53 = $r1.getPath();
            $r42.append($r53);
            $r42.append(" of size ");
            long $l2 = $r1.length();
            $r42.append($l2);
            String $r54 = $r42.toString();
            Log.i("MultiDex", $r54);
            boolean $z0 = $r1.delete();
            if ($z0) {
                StringBuilder $r43 = new StringBuilder();
                $r43.append("Deleted old file ");
                String $r55 = $r1.getPath();
                $r43.append($r55);
                String $r56 = $r43.toString();
                Log.i("MultiDex", $r56);
            } else {
                StringBuilder $r44 = new StringBuilder();
                $r44.append("Failed to delete old file ");
                String $r57 = $r1.getPath();
                $r44.append($r57);
                String $r58 = $r44.toString();
                Log.w("MultiDex", $r58);
            }
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
    /* JADX WARN: Incorrect condition in loop: B:4:0x005b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void put(android.content.Context r14, java.lang.String r15, long r16, long r18, java.util.List r20) {
        /*
            android.content.SharedPreferences r3 = get(r14)
            android.content.SharedPreferences$Editor r4 = r3.edit()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r15)
            java.lang.String r6 = "timestamp"
            r5.append(r6)
            java.lang.String r7 = r5.toString()
            r0 = r16
            r4.putLong(r7, r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r15)
            java.lang.String r6 = "crc"
            r5.append(r6)
            java.lang.String r7 = r5.toString()
            r0 = r18
            r4.putLong(r7, r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r15)
            java.lang.String r6 = "dex.number"
            r5.append(r6)
            java.lang.String r7 = r5.toString()
            r0 = r20
            int r8 = r0.size()
            int r8 = r8 + 1
            r4.putInt(r7, r8)
            r0 = r20
            java.util.Iterator r9 = r0.iterator()
            r8 = 2
        L57:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto La2
            java.lang.Object r11 = r9.next()
            r13 = r11
            g.expandableListView.Attribute r13 = (p201g.expandableListView.Attribute) r13
            r12 = r13
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r15)
            java.lang.String r6 = "dex.crc."
            r5.append(r6)
            r5.append(r8)
            java.lang.String r7 = r5.toString()
            long r0 = r12.length
            r16 = r0
            r4.putLong(r7, r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r15)
            java.lang.String r6 = "dex.time."
            r5.append(r6)
            r5.append(r8)
            java.lang.String r7 = r5.toString()
            long r16 = r12.lastModified()
            r0 = r16
            r4.putLong(r7, r0)
            int r8 = r8 + 1
            goto L57
        La2:
            r4.commit()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.expandableListView.Cache.put(android.content.Context, java.lang.String, long, long, java.util.List):void");
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
    private List read(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        StringBuilder $r3 = new StringBuilder();
        File $r4 = this.file;
        String $r5 = $r4.getName();
        $r3.append($r5);
        $r3.append(".classes");
        String $r52 = $r3.toString();
        SharedPreferences $r6 = get(context);
        String $r8 = str + "dex.number";
        int $i1 = $r6.getInt($r8, 1);
        int $i2 = $i1 - 1;
        ArrayList $r9 = new ArrayList($i2);
        for (int $i22 = 2; $i22 <= $i1; $i22++) {
            String $r82 = $r52 + $i22 + ".zip";
            File $r42 = this.length;
            Attribute $r10 = new Attribute($r42, $r82);
            boolean $z0 = $r10.isFile();
            if (!$z0) {
                StringBuilder $r32 = new StringBuilder();
                $r32.append("Missing extracted secondary dex file '");
                String $r1 = $r10.getPath();
                $r32.append($r1);
                $r32.append("'");
                String $r12 = $r32.toString();
                IOException $r11 = new IOException($r12);
                throw $r11;
            }
            $r10.length = toString($r10);
            String $r83 = str + "dex.crc." + $i22;
            long $l3 = $r6.getLong($r83, -1L);
            String $r84 = str + "dex.time." + $i22;
            long $l4 = $r6.getLong($r84, -1L);
            long $l5 = $r10.lastModified();
            if ($l4 == $l5) {
                long $l6 = $r10.length;
                if ($l3 == $l6) {
                    $r9.add($r10);
                }
            }
            String $r13 = "Invalid extracted dex: " + $r10 + " (key \"" + str + "\"), expected modification time: " + $l4 + ", modification time: " + $l5 + ", expected crc: " + $l3 + ", file crc: " + $r10.length;
            IOException $r112 = new IOException($r13);
            throw $r112;
        }
        return $r9;
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
    private static boolean save(Context context, File file, long j, String str) {
        SharedPreferences $r3 = get(context);
        String $r5 = str + "timestamp";
        long $l1 = $r3.getLong($r5, -1L);
        long $l2 = get(file);
        if ($l1 == $l2) {
            String $r2 = str + "crc";
            long $l12 = $r3.getLong($r2, -1L);
            return $l12 != j;
        }
        return true;
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
    private static long toString(File file) throws IOException {
        long $l0 = ZipUtil.getZipCrc(file);
        return $l0 == -1 ? $l0 - 1 : $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        FileLock $r1 = this.source;
        $r1.release();
        FileChannel $r2 = this.channel;
        $r2.close();
        RandomAccessFile $r3 = this.f17916in;
        $r3.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
    public List load(Context context, String str, boolean z) throws IOException {
        List $r7;
        StringBuilder $r3 = new StringBuilder();
        $r3.append("MultiDexExtractor.load(");
        File $r4 = this.file;
        String $r5 = $r4.getPath();
        $r3.append($r5);
        $r3.append(", ");
        $r3.append(z);
        $r3.append(", ");
        $r3.append(str);
        $r3.append(")");
        String $r52 = $r3.toString();
        Log.i("MultiDex", $r52);
        FileLock $r6 = this.source;
        boolean $z1 = $r6.isValid();
        if (!$z1) {
            IllegalStateException $r10 = new IllegalStateException("MultiDexExtractor was closed");
            throw $r10;
        }
        if (!z) {
            File $r42 = this.file;
            long $l0 = this.f17915id;
            boolean $z12 = save(context, $r42, $l0, str);
            if (!$z12) {
                try {
                    $r7 = read(context, str);
                } catch (IOException $r8) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", $r8);
                    List $r9 = performExtractions();
                    $r7 = $r9;
                    File $r43 = this.file;
                    long $l02 = get($r43);
                    long $l1 = this.f17915id;
                    put(context, str, $l02, $l1, $r9);
                }
                StringBuilder $r32 = new StringBuilder();
                $r32.append("load found ");
                int $i2 = $r7.size();
                $r32.append($i2);
                $r32.append(" secondary dex files");
                String $r2 = $r32.toString();
                Log.i("MultiDex", $r2);
                return $r7;
            }
        }
        if (z) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        List $r92 = performExtractions();
        $r7 = $r92;
        File $r44 = this.file;
        long $l03 = get($r44);
        long $l12 = this.f17915id;
        put(context, str, $l03, $l12, $r92);
        StringBuilder $r322 = new StringBuilder();
        $r322.append("load found ");
        int $i22 = $r7.size();
        $r322.append($i22);
        $r322.append(" secondary dex files");
        String $r22 = $r322.toString();
        Log.i("MultiDex", $r22);
        return $r7;
    }
}
