package p272h.p375g.p376a;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
/* compiled from: IsoType.java */
/* renamed from: h.g.a.d */
/* loaded from: classes2.dex */
public enum EnumC9428d {
    NUMERIC(true, 0),
    ALPHA(true, 0),
    LLVAR(false, 0),
    LLLVAR(false, 0),
    DATE10(false, 10),
    DATE4(false, 4),
    DATE_EXP(false, 4),
    TIME(false, 6),
    AMOUNT(false, 12),
    BINARY(true, 0),
    LLBIN(false, 0),
    LLLBIN(false, 0);
    

    /* renamed from: c */
    private boolean f22081c;

    /* renamed from: d */
    private int f22082d;

    EnumC9428d(boolean z, int i) {
        this.f22081c = z;
        this.f22082d = i;
    }

    /* renamed from: a */
    public String m14769a(long j, int i) {
        if (this == NUMERIC) {
            String format = String.format(String.format("%%0%dd", Integer.valueOf(i)), Long.valueOf(j));
            if (format.length() <= i) {
                return format;
            }
            throw new IllegalArgumentException("Numeric value is larger than intended length: " + j + " LEN " + i);
        } else if (this != ALPHA && this != LLVAR && this != LLLVAR) {
            if (this == AMOUNT) {
                return String.format("%010d00", Long.valueOf(j));
            }
            if (this != BINARY) {
                EnumC9428d enumC9428d = LLBIN;
            }
            throw new IllegalArgumentException("Cannot format number as " + this);
        } else {
            return m14768b(Long.toString(j), i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d3 -> B:49:0x00d5). Please submit an issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m14768b(java.lang.String r8, int r9) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p272h.p375g.p376a.EnumC9428d.m14768b(java.lang.String, int):java.lang.String");
    }

    /* renamed from: e */
    public String m14767e(BigDecimal bigDecimal, int i) {
        if (this == AMOUNT) {
            return String.format("%012d", Long.valueOf(bigDecimal.movePointRight(2).longValue()));
        }
        if (this == NUMERIC) {
            return m14769a(bigDecimal.longValue(), i);
        }
        if (this != ALPHA && this != LLVAR && this != LLLVAR) {
            if (this != BINARY) {
                EnumC9428d enumC9428d = LLBIN;
            }
            throw new IllegalArgumentException("Cannot format BigDecimal as " + this);
        }
        return m14768b(bigDecimal.toString(), i);
    }

    /* renamed from: g */
    public String m14766g(Date date, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat;
        if (this == DATE10) {
            simpleDateFormat = new SimpleDateFormat("MMddHHmmss");
        } else if (this == DATE4) {
            simpleDateFormat = new SimpleDateFormat("MMdd");
        } else if (this == DATE_EXP) {
            simpleDateFormat = new SimpleDateFormat("yyMM");
        } else if (this == TIME) {
            simpleDateFormat = new SimpleDateFormat("HHmmss");
        } else {
            throw new IllegalArgumentException("Cannot format date as " + this);
        }
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat.format(date);
    }

    /* renamed from: h */
    public int m14765h() {
        return this.f22082d;
    }

    /* renamed from: i */
    public boolean m14764i() {
        return this.f22081c;
    }
}
