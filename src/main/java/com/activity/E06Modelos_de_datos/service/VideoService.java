package com.activity.E06Modelos_de_datos.service;

import com.activity.E06Modelos_de_datos.model.Video;
import com.activity.E06Modelos_de_datos.repos.VideoRepository;
import com.activity.E06Modelos_de_datos.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class VideoService  extends BaseService<Video, Long, VideoRepository> {
}
