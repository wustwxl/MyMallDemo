package com.wust.portal.service;

import com.wust.portal.pojo.SearchResult;

public interface SearchService {

	SearchResult search(String queryString, int page);
}
