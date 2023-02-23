package com.paypad.models.messaging.nibss;

import com.google.protobuf.AbstractC7008b;
import com.google.protobuf.AbstractC7039i;
import com.google.protobuf.AbstractC7052j;
import com.google.protobuf.C7089p;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InterfaceC7007a1;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
/* loaded from: classes2.dex */
public final class PinpadKeysRequestProto {
    private static Descriptors.FileDescriptor descriptor;
    private static Descriptors.Descriptor internal_static_PinpadKeysRequest_descriptor;
    private static GeneratedMessage.FieldAccessorTable internal_static_PinpadKeysRequest_fieldAccessorTable;

    /* loaded from: classes2.dex */
    public static final class PinpadKeysRequest extends GeneratedMessage implements PinpadKeysRequestOrBuilder {
        public static final int BANK_FIELD_NUMBER = 5;
        public static InterfaceC7007a1<PinpadKeysRequest> PARSER = new AbstractC7008b<PinpadKeysRequest>() { // from class: com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequest.1
            @Override // com.google.protobuf.InterfaceC7007a1
            public PinpadKeysRequest parsePartialFrom(AbstractC7052j abstractC7052j, C7089p c7089p) throws InvalidProtocolBufferException {
                return new PinpadKeysRequest(abstractC7052j, c7089p);
            }
        };
        public static final int SERIAL_NO_FIELD_NUMBER = 1;
        public static final int TERMINAL_ID_FIELD_NUMBER = 2;
        public static final int TERMINAL_ID_OTHER_FIELD_NUMBER = 3;
        public static final int VAS_FIELD_NUMBER = 4;
        private static final PinpadKeysRequest defaultInstance;
        private static final long serialVersionUID = 0;
        private Object bank_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object serialNo_;
        private Object terminalIdOther_;
        private Object terminalId_;
        private final UnknownFieldSet unknownFields;
        private boolean vas_;

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessage.Builder<Builder> implements PinpadKeysRequestOrBuilder {
            private Object bank_;
            private int bitField0_;
            private Object serialNo_;
            private Object terminalIdOther_;
            private Object terminalId_;
            private boolean vas_;

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PinpadKeysRequestProto.internal_static_PinpadKeysRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = PinpadKeysRequest.alwaysUseFieldBuilders;
            }

            public Builder clearBank() {
                this.bitField0_ &= -17;
                this.bank_ = PinpadKeysRequest.getDefaultInstance().getBank();
                onChanged();
                return this;
            }

            public Builder clearSerialNo() {
                this.bitField0_ &= -2;
                this.serialNo_ = PinpadKeysRequest.getDefaultInstance().getSerialNo();
                onChanged();
                return this;
            }

            public Builder clearTerminalId() {
                this.bitField0_ &= -3;
                this.terminalId_ = PinpadKeysRequest.getDefaultInstance().getTerminalId();
                onChanged();
                return this;
            }

            public Builder clearTerminalIdOther() {
                this.bitField0_ &= -5;
                this.terminalIdOther_ = PinpadKeysRequest.getDefaultInstance().getTerminalIdOther();
                onChanged();
                return this;
            }

            public Builder clearVas() {
                this.bitField0_ &= -9;
                this.vas_ = false;
                onChanged();
                return this;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public String getBank() {
                Object obj = this.bank_;
                if (!(obj instanceof String)) {
                    String m20098d0 = ((AbstractC7039i) obj).m20098d0();
                    this.bank_ = m20098d0;
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public AbstractC7039i getBankBytes() {
                Object obj = this.bank_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.bank_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return PinpadKeysRequestProto.internal_static_PinpadKeysRequest_descriptor;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public String getSerialNo() {
                Object obj = this.serialNo_;
                if (!(obj instanceof String)) {
                    String m20098d0 = ((AbstractC7039i) obj).m20098d0();
                    this.serialNo_ = m20098d0;
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public AbstractC7039i getSerialNoBytes() {
                Object obj = this.serialNo_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.serialNo_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public String getTerminalId() {
                Object obj = this.terminalId_;
                if (!(obj instanceof String)) {
                    String m20098d0 = ((AbstractC7039i) obj).m20098d0();
                    this.terminalId_ = m20098d0;
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public AbstractC7039i getTerminalIdBytes() {
                Object obj = this.terminalId_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.terminalId_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public String getTerminalIdOther() {
                Object obj = this.terminalIdOther_;
                if (!(obj instanceof String)) {
                    String m20098d0 = ((AbstractC7039i) obj).m20098d0();
                    this.terminalIdOther_ = m20098d0;
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public AbstractC7039i getTerminalIdOtherBytes() {
                Object obj = this.terminalIdOther_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.terminalIdOther_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public boolean getVas() {
                return this.vas_;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public boolean hasBank() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public boolean hasSerialNo() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public boolean hasTerminalId() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public boolean hasTerminalIdOther() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
            public boolean hasVas() {
                return (this.bitField0_ & 8) == 8;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return PinpadKeysRequestProto.internal_static_PinpadKeysRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PinpadKeysRequest.class, Builder.class);
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder setBank(String str) {
                if (str != null) {
                    this.bitField0_ |= 16;
                    this.bank_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setBankBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 16;
                    this.bank_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setSerialNo(String str) {
                if (str != null) {
                    this.bitField0_ |= 1;
                    this.serialNo_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setSerialNoBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 1;
                    this.serialNo_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setTerminalId(String str) {
                if (str != null) {
                    this.bitField0_ |= 2;
                    this.terminalId_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setTerminalIdBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 2;
                    this.terminalId_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setTerminalIdOther(String str) {
                if (str != null) {
                    this.bitField0_ |= 4;
                    this.terminalIdOther_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setTerminalIdOtherBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 4;
                    this.terminalIdOther_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setVas(boolean z) {
                this.bitField0_ |= 8;
                this.vas_ = z;
                onChanged();
                return this;
            }

            private Builder() {
                this.serialNo_ = "";
                this.terminalId_ = "";
                this.terminalIdOther_ = "";
                this.bank_ = "";
                maybeForceBuilderInitialization();
            }

            /* renamed from: build  reason: collision with other method in class */
            public PinpadKeysRequest m41904build() {
                PinpadKeysRequest m41906buildPartial = m41906buildPartial();
                if (m41906buildPartial.isInitialized()) {
                    return m41906buildPartial;
                }
                throw newUninitializedMessageException(m41906buildPartial);
            }

            /* renamed from: buildPartial  reason: collision with other method in class */
            public PinpadKeysRequest m41906buildPartial() {
                PinpadKeysRequest pinpadKeysRequest = new PinpadKeysRequest(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                pinpadKeysRequest.serialNo_ = this.serialNo_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                pinpadKeysRequest.terminalId_ = this.terminalId_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                pinpadKeysRequest.terminalIdOther_ = this.terminalIdOther_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                pinpadKeysRequest.vas_ = this.vas_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                pinpadKeysRequest.bank_ = this.bank_;
                pinpadKeysRequest.bitField0_ = i2;
                onBuilt();
                return pinpadKeysRequest;
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public PinpadKeysRequest m41918getDefaultInstanceForType() {
                return PinpadKeysRequest.getDefaultInstance();
            }

            /* renamed from: clear  reason: collision with other method in class */
            public Builder m41910clear() {
                super.clear();
                this.serialNo_ = "";
                int i = this.bitField0_ & (-2);
                this.bitField0_ = i;
                this.terminalId_ = "";
                int i2 = i & (-3);
                this.bitField0_ = i2;
                this.terminalIdOther_ = "";
                int i3 = i2 & (-5);
                this.bitField0_ = i3;
                this.vas_ = false;
                int i4 = i3 & (-9);
                this.bitField0_ = i4;
                this.bank_ = "";
                this.bitField0_ = i4 & (-17);
                return this;
            }

            /* renamed from: clone  reason: collision with other method in class */
            public Builder m41917clone() {
                return create().mergeFrom(m41906buildPartial());
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public Builder m41920mergeFrom(Message message) {
                if (message instanceof PinpadKeysRequest) {
                    return mergeFrom((PinpadKeysRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(GeneratedMessage.BuilderParent builderParent) {
                super(builderParent);
                this.serialNo_ = "";
                this.terminalId_ = "";
                this.terminalIdOther_ = "";
                this.bank_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(PinpadKeysRequest pinpadKeysRequest) {
                if (pinpadKeysRequest == PinpadKeysRequest.getDefaultInstance()) {
                    return this;
                }
                if (pinpadKeysRequest.hasSerialNo()) {
                    this.bitField0_ |= 1;
                    this.serialNo_ = pinpadKeysRequest.serialNo_;
                    onChanged();
                }
                if (pinpadKeysRequest.hasTerminalId()) {
                    this.bitField0_ |= 2;
                    this.terminalId_ = pinpadKeysRequest.terminalId_;
                    onChanged();
                }
                if (pinpadKeysRequest.hasTerminalIdOther()) {
                    this.bitField0_ |= 4;
                    this.terminalIdOther_ = pinpadKeysRequest.terminalIdOther_;
                    onChanged();
                }
                if (pinpadKeysRequest.hasVas()) {
                    setVas(pinpadKeysRequest.getVas());
                }
                if (pinpadKeysRequest.hasBank()) {
                    this.bitField0_ |= 16;
                    this.bank_ = pinpadKeysRequest.bank_;
                    onChanged();
                }
                mergeUnknownFields(pinpadKeysRequest.getUnknownFields());
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            /* renamed from: mergeFrom  reason: collision with other method in class */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequest.Builder m41923mergeFrom(com.google.protobuf.AbstractC7052j r3, com.google.protobuf.C7089p r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.a1<com.paypad.models.messaging.nibss.PinpadKeysRequestProto$PinpadKeysRequest> r1 = com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequest.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.paypad.models.messaging.nibss.PinpadKeysRequestProto$PinpadKeysRequest r3 = (com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequest) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.mergeFrom(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    com.google.protobuf.r0 r4 = r3.m20257b()     // Catch: java.lang.Throwable -> Lf
                    com.paypad.models.messaging.nibss.PinpadKeysRequestProto$PinpadKeysRequest r4 = (com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequest) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.mergeFrom(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequest.Builder.m41923mergeFrom(com.google.protobuf.j, com.google.protobuf.p):com.paypad.models.messaging.nibss.PinpadKeysRequestProto$PinpadKeysRequest$Builder");
            }
        }

        static {
            PinpadKeysRequest pinpadKeysRequest = new PinpadKeysRequest(true);
            defaultInstance = pinpadKeysRequest;
            pinpadKeysRequest.initFields();
        }

        public static PinpadKeysRequest getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PinpadKeysRequestProto.internal_static_PinpadKeysRequest_descriptor;
        }

        private void initFields() {
            this.serialNo_ = "";
            this.terminalId_ = "";
            this.terminalIdOther_ = "";
            this.vas_ = false;
            this.bank_ = "";
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static PinpadKeysRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream);
        }

        public static PinpadKeysRequest parseFrom(AbstractC7039i abstractC7039i) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(abstractC7039i);
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public String getBank() {
            Object obj = this.bank_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.bank_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public AbstractC7039i getBankBytes() {
            Object obj = this.bank_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.bank_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        public InterfaceC7007a1<PinpadKeysRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public String getSerialNo() {
            Object obj = this.serialNo_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.serialNo_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public AbstractC7039i getSerialNoBytes() {
            Object obj = this.serialNo_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.serialNo_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int m20326h = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.m20326h(1, getSerialNoBytes()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                m20326h += CodedOutputStream.m20326h(2, getTerminalIdBytes());
            }
            if ((this.bitField0_ & 4) == 4) {
                m20326h += CodedOutputStream.m20326h(3, getTerminalIdOtherBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                m20326h += CodedOutputStream.m20332e(4, this.vas_);
            }
            if ((this.bitField0_ & 16) == 16) {
                m20326h += CodedOutputStream.m20326h(5, getBankBytes());
            }
            int serializedSize = m20326h + getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public String getTerminalId() {
            Object obj = this.terminalId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.terminalId_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public AbstractC7039i getTerminalIdBytes() {
            Object obj = this.terminalId_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.terminalId_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public String getTerminalIdOther() {
            Object obj = this.terminalIdOther_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.terminalIdOther_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public AbstractC7039i getTerminalIdOtherBytes() {
            Object obj = this.terminalIdOther_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.terminalIdOther_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public boolean getVas() {
            return this.vas_;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public boolean hasBank() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public boolean hasSerialNo() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public boolean hasTerminalId() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public boolean hasTerminalIdOther() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysRequestProto.PinpadKeysRequestOrBuilder
        public boolean hasVas() {
            return (this.bitField0_ & 8) == 8;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return PinpadKeysRequestProto.internal_static_PinpadKeysRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PinpadKeysRequest.class, Builder.class);
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b != -1) {
                return b == 1;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo20264p0(1, getSerialNoBytes());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo20264p0(2, getTerminalIdBytes());
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.mo20264p0(3, getTerminalIdOtherBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.mo20270l0(4, this.vas_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.mo20264p0(5, getBankBytes());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static Builder newBuilder(PinpadKeysRequest pinpadKeysRequest) {
            return newBuilder().mergeFrom(pinpadKeysRequest);
        }

        public static PinpadKeysRequest parseDelimitedFrom(InputStream inputStream, C7089p c7089p) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream, c7089p);
        }

        public static PinpadKeysRequest parseFrom(AbstractC7039i abstractC7039i, C7089p c7089p) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(abstractC7039i, c7089p);
        }

        private PinpadKeysRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        public static PinpadKeysRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public PinpadKeysRequest m41897getDefaultInstanceForType() {
            return defaultInstance;
        }

        /* renamed from: toBuilder  reason: collision with other method in class */
        public Builder m41902toBuilder() {
            return newBuilder(this);
        }

        public static PinpadKeysRequest parseFrom(byte[] bArr, C7089p c7089p) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, c7089p);
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public Builder m41899newBuilderForType() {
            return newBuilder();
        }

        public static PinpadKeysRequest parseFrom(InputStream inputStream) throws IOException {
            return PARSER.parseFrom(inputStream);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static PinpadKeysRequest parseFrom(InputStream inputStream, C7089p c7089p) throws IOException {
            return PARSER.parseFrom(inputStream, c7089p);
        }

        private PinpadKeysRequest(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static PinpadKeysRequest parseFrom(AbstractC7052j abstractC7052j) throws IOException {
            return PARSER.parseFrom(abstractC7052j);
        }

        public static PinpadKeysRequest parseFrom(AbstractC7052j abstractC7052j, C7089p c7089p) throws IOException {
            return PARSER.parseFrom(abstractC7052j, c7089p);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private PinpadKeysRequest(AbstractC7052j abstractC7052j, C7089p c7089p) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int mo20019E = abstractC7052j.mo20019E();
                        if (mo20019E != 0) {
                            if (mo20019E == 10) {
                                this.bitField0_ |= 1;
                                this.serialNo_ = abstractC7052j.mo19993p();
                            } else if (mo20019E == 18) {
                                this.bitField0_ |= 2;
                                this.terminalId_ = abstractC7052j.mo19993p();
                            } else if (mo20019E == 26) {
                                this.bitField0_ |= 4;
                                this.terminalIdOther_ = abstractC7052j.mo19993p();
                            } else if (mo20019E == 32) {
                                this.bitField0_ |= 8;
                                this.vas_ = abstractC7052j.mo19994o();
                            } else if (mo20019E != 42) {
                                if (!parseUnknownField(abstractC7052j, newBuilder, c7089p, mo20019E)) {
                                }
                            } else {
                                this.bitField0_ |= 16;
                                this.bank_ = abstractC7052j.mo19993p();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.m20247l(this);
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.m20247l(this);
                        throw invalidProtocolBufferException;
                    }
                } finally {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface PinpadKeysRequestOrBuilder extends MessageOrBuilder {
        String getBank();

        AbstractC7039i getBankBytes();

        String getSerialNo();

        AbstractC7039i getSerialNoBytes();

        String getTerminalId();

        AbstractC7039i getTerminalIdBytes();

        String getTerminalIdOther();

        AbstractC7039i getTerminalIdOtherBytes();

        boolean getVas();

        boolean hasBank();

        boolean hasSerialNo();

        boolean hasTerminalId();

        boolean hasTerminalIdOther();

        boolean hasVas();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017PinpadKeysRequest.proto\"q\n\u0011PinpadKeysRequest\u0012\u0011\n\tserial_no\u0018\u0001 \u0001(\t\u0012\u0013\n\u000bterminal_id\u0018\u0002 \u0001(\t\u0012\u0019\n\u0011terminal_id_other\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003vas\u0018\u0004 \u0001(\b\u0012\f\n\u0004bank\u0018\u0005 \u0001(\tB$\n\nhsmutilityB\u0016PinpadKeysRequestProto"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.paypad.models.messaging.nibss.PinpadKeysRequestProto.1
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = PinpadKeysRequestProto.descriptor = fileDescriptor;
                Descriptors.Descriptor unused2 = PinpadKeysRequestProto.internal_static_PinpadKeysRequest_descriptor = (Descriptors.Descriptor) PinpadKeysRequestProto.getDescriptor().getMessageTypes().get(0);
                GeneratedMessage.FieldAccessorTable unused3 = PinpadKeysRequestProto.internal_static_PinpadKeysRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(PinpadKeysRequestProto.internal_static_PinpadKeysRequest_descriptor, new String[]{"SerialNo", "TerminalId", "TerminalIdOther", "Vas", "Bank"});
                return null;
            }
        });
    }

    private PinpadKeysRequestProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
    }
}
