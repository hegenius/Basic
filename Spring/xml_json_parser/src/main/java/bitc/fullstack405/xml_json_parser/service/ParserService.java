package bitc.fullstack405.xml_json_parser.service;

import bitc.fullstack405.xml_json_parser.dto.kobis.BoxOfficeResultDTO;
import bitc.fullstack405.xml_json_parser.dto.pharmacy.FullDataItemDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ParserService {

  List<FullDataItemDTO> getItemListFile(String fileName) throws Exception;

  List<FullDataItemDTO> getItemListUrl(String serviceUrl) throws Exception;


  List<BoxOfficeResultDTO> getDayilyBoxOfficeList(String serviceUrl) throws Exception;
}
