package com.google.gson.internal.bind;

import com.google.gson.AbstractC6909s;
import com.google.gson.C6784f;
import com.google.gson.InterfaceC6915t;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p184v.C6916a;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import com.google.gson.stream.EnumC6913b;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* loaded from: classes2.dex */
public final class SqlDateTypeAdapter extends AbstractC6909s<Date> {

    /* renamed from: b */
    public static final InterfaceC6915t f16402b = new InterfaceC6915t() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // com.google.gson.InterfaceC6915t
        /* renamed from: a */
        public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
            if (c6916a.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final DateFormat f16403a = new SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.gson.AbstractC6909s
    /* renamed from: e */
    public synchronized Date mo20528b(C6911a c6911a) throws IOException {
        if (c6911a.mo20525C0() == EnumC6913b.NULL) {
            c6911a.mo20495w0();
            return null;
        }
        try {
            return new Date(this.f16403a.parse(c6911a.mo20493z0()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // com.google.gson.AbstractC6909s
    /* renamed from: f */
    public synchronized void mo20527d(C6914c c6914c, Date date) throws IOException {
        c6914c.mo20486F0(date == null ? null : this.f16403a.format((java.util.Date) date));
    }
}
