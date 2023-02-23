package io.intercom.okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import p425j.p429b.p433b.C11146c;
/* loaded from: classes3.dex */
final class FileOperator {
    private final FileChannel fileChannel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public void read(long j, C11146c c11146c, long j2) throws IOException {
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferTo = this.fileChannel.transferTo(j, j2, c11146c);
            j += transferTo;
            j2 -= transferTo;
        }
    }

    public void write(long j, C11146c c11146c, long j2) throws IOException {
        if (j2 < 0 || j2 > c11146c.m11579J0()) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long transferFrom = this.fileChannel.transferFrom(c11146c, j3, j4);
            j3 += transferFrom;
            j4 -= transferFrom;
        }
    }
}
