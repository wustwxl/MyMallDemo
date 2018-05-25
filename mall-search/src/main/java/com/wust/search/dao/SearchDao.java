package com.wust.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import com.wust.search.pojo.SearchResult;

public interface SearchDao {

	SearchResult search(SolrQuery query) throws Exception;
}
