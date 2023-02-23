package com.github.kittinunf.fuel.core;

import kotlin.Metadata;
/* compiled from: HttpException.kt */
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m10421d2 = {"Lcom/github/kittinunf/fuel/core/HttpException;", "Ljava/lang/Exception;", "", "httpCode", "", "httpMessage", "<init>", "(ILjava/lang/String;)V", "fuel"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class HttpException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(int i, String str) {
        super("HTTP Exception " + i + ' ' + str);
        kotlin.e0.d.l.g(str, "httpMessage");
    }
}
