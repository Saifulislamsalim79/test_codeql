package com.google.gson.internal.bind;

import com.google.gson.AbstractC6909s;
import com.google.gson.C6784f;
import com.google.gson.InterfaceC6915t;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C6873d;
import com.google.gson.internal.C6885i;
import com.google.gson.internal.bind.p182d.C6857a;
import com.google.gson.p184v.C6916a;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import com.google.gson.stream.EnumC6913b;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class DateTypeAdapter extends AbstractC6909s<Date> {

    /* renamed from: b */
    public static final InterfaceC6915t f16374b = new InterfaceC6915t() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.InterfaceC6915t
        /* renamed from: a */
        public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
            if (c6916a.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final List<DateFormat> f16375a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f16375a = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f16375a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C6873d.m20585e()) {
            this.f16375a.add(C6885i.m20565c(2, 2));
        }
    }

    /* renamed from: e */
    private synchronized Date m20692e(String str) {
        for (DateFormat dateFormat : this.f16375a) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C6857a.m20595c(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new JsonSyntaxException(str, e);
        }
    }

    @Override // com.google.gson.AbstractC6909s
    /* renamed from: f */
    public Date mo20528b(C6911a c6911a) throws IOException {
        if (c6911a.mo20525C0() == EnumC6913b.NULL) {
            c6911a.mo20495w0();
            return null;
        }
        return m20692e(c6911a.mo20493z0());
    }

    @Override // com.google.gson.AbstractC6909s
    /* renamed from: g */
    public synchronized void mo20527d(C6914c c6914c, Date date) throws IOException {
        if (date == null) {
            c6914c.mo20474f0();
        } else {
            c6914c.mo20486F0(this.f16375a.get(0).format(date));
        }
    }
}
