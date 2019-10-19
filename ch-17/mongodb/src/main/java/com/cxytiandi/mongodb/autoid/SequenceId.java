package com.cxytiandi.mongodb.autoid;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "sequence")
public class SequenceId {

	@Id
	private String id;

	// 自增 ID 值
	@Field("seq_id")
	private long seqId;

	// 集合名称
	@Field("coll_name")
	private String collName;

}
