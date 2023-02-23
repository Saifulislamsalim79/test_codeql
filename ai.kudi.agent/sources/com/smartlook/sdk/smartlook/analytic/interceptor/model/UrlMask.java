package com.smartlook.sdk.smartlook.analytic.interceptor.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.e0.d.l;
import kotlin.p549l0.C13262h;
@Keep
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u000eR\u0019\u0010\u0002\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/analytic/interceptor/model/UrlMask;", "Lkotlin/text/Regex;", "regex", "Lkotlin/text/Regex;", "getRegex", "()Lkotlin/text/Regex;", "", "replaceWith", "Ljava/lang/String;", "getReplaceWith", "()Ljava/lang/String;", "<init>", "(Lkotlin/text/Regex;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class UrlMask {
    private final C13262h regex;
    private final String replaceWith;

    private UrlMask(C13262h c13262h, String str) {
        this.regex = c13262h;
        this.replaceWith = str;
    }

    public final C13262h getRegex() {
        return this.regex;
    }

    public final String getReplaceWith() {
        return this.replaceWith;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UrlMask(String str) {
        this(new C13262h(str), "<sensitive>");
        l.f(str, "regex");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UrlMask(String str, String str2) {
        this(new C13262h(str), str2);
        l.f(str, "regex");
        l.f(str2, "replaceWith");
    }
}
